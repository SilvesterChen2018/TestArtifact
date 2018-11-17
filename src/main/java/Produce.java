import impl.SendMailFactory;
import impl.SendSmsFactory;
import inf.Provider;
import inf.Sender;

public class Produce {
    public static void main(String[] args) {
        Provider provider1 = new SendMailFactory();
        Sender sender1 = provider1.produce();
        sender1.Send();

        Provider provider2 = new SendSmsFactory();
        Sender sender2 = provider2.produce();
        sender2.Send();
    }
}
