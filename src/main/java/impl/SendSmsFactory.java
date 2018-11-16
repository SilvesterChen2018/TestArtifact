package impl;

import inf.Provider;
import inf.Sender;

public class SendSmsFactory implements Provider {

    public Sender produce() {
        return new SmsSender();
    }
}