package nnm.bender.message;

import nnm.bender.message.mail.*;
import nnm.bender.message.mail.Package;
import nnm.bender.message.mailWorker.Thief;

public class Main {
    public static void main(String[] args) {
        MailPackage mailPackage = new MailPackage("from", "to", new Package("My package",20));
        Thief thief = new Thief(20);
        thief.processMail(mailPackage);
    }
}
