package nnm.bender.message.mailWorker;

import nnm.bender.message.mail.MailPackage;
import nnm.bender.message.mailService.MailService;
import nnm.bender.message.sendable.Sendable;

//Если он заметил запрещенную посылку с одним из запрещенных содержимым ("weapons" и "banned substance"),
//то он бросает IllegalPackageException.

// Если он находит посылку, состаящую из камней (содержит слово "stones"),
//то тревога прозвучит в виде StolenPackageException.


public class Inspector implements MailService {
    public Inspector() {
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            String content = ((MailPackage) mail).getContent().getContent();
            if((content.contains("weapons"))||(content.contains("banned substance"))){
                throw new IllegalPackageException();
            }
            if (content.contains("stones")){
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}

class IllegalPackageException extends RuntimeException{
    public IllegalPackageException() {
    }

    public IllegalPackageException(String message) {
        super(message);
    }

    public IllegalPackageException(String message, Throwable cause) {
        super(message, cause);
    }
}

class StolenPackageException extends RuntimeException{
    public StolenPackageException() {
    }

    public StolenPackageException(String message) {
        super(message);
    }

    public StolenPackageException(String message, Throwable cause) {
        super(message, cause);
    }
}
