package nnm.bender.message.mailWorker;

import nnm.bender.message.mailService.MailService;
import nnm.bender.message.mailService.RealMailService;
import nnm.bender.message.sendable.Sendable;

public class UntrustworthyMailWorker implements MailService {
    private MailService[] mailServise;
    private RealMailService mRealMailService;

    public UntrustworthyMailWorker(MailService[] mail) {
        this.mailServise = new MailService[mail.length];
        for (int i = 0; i < mail.length; i++) {
            this.mailServise[i] = mail[i];
        }
        mRealMailService = new RealMailService();
    }

    public RealMailService getRealMailService() {
        return mRealMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable buff = null;
        for (int i = 0; i < this.mailServise.length; i++) {

            if (i == 0) {
                buff = this.mailServise[0].processMail(mail);
                continue;
            }

            buff = this.mailServise[i].processMail(buff);
        }
        return getRealMailService().processMail(buff);
    }
}
