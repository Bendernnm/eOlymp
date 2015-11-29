package nnm.bender.message.mailWorker;

import nnm.bender.message.mail.MailMessage;
import nnm.bender.message.mailService.MailService;
import nnm.bender.message.sendable.Sendable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger mLogger;

    public Spy(Logger logger) {
        mLogger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            String from = mail.getFrom();
            String to = mail.getTo();
            if ((from.equals("Austin Powers")) || (to.equals("Austin Powers"))) {
                String message = ((MailMessage) mail).getMessage();
                mLogger.log(Level.WARNING,
                        "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[]{from, to, message});
            } else {
                mLogger.log(Level.INFO,
                        "Usual correspondence: from {0} to {1}",
                        new Object[]{from, to});
            }
        }
        return mail;
    }
}
