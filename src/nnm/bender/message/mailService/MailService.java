package nnm.bender.message.mailService;

import nnm.bender.message.sendable.Sendable;

public interface MailService {
    Sendable processMail(Sendable mail);
}
