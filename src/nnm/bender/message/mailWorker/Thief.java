package nnm.bender.message.mailWorker;

import nnm.bender.message.mail.*;
import nnm.bender.message.mail.Package;
import nnm.bender.message.mailService.MailService;
import nnm.bender.message.sendable.Sendable;

public class Thief implements MailService {
    private int mMinStolenValue;
    private int mSummaryStolenValue;

    public Thief(int minStolenValue) {
        mMinStolenValue = minStolenValue;
        mSummaryStolenValue = 0;
    }

    public int getStolenValue() {
        return mSummaryStolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            int cost = ((MailPackage) mail).getContent().getPrice();
            if (cost >= mMinStolenValue) {
                String content = "stones instead of " + ((MailPackage) mail).getContent().getContent();
                MailPackage mailPackage = new MailPackage(mail.getFrom(), mail.getTo(), new Package(content,0));
                mSummaryStolenValue += cost;
                return mailPackage;
            }
        }
        return mail;
    }
}
