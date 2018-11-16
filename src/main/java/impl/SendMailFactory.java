package impl;

import inf.Provider;
import inf.Sender;

public class SendMailFactory implements Provider {

    public Sender produce(){
        return new MailSender();
    }
}
