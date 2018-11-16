import impl.SendMailFactory;
import inf.Provider;
import inf.Sender;

public class Produce {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
