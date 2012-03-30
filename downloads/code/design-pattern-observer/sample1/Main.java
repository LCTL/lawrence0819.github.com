import java.util.Random;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        
        NewsTopic topic = new NewsTopic();

        Client client1 = new Client(topic);
        Client client2 = new Client(topic);
        Client client3 = new Client(topic);

        Timer timer1 = new Timer();
        timer1.schedule(client1, 50, 3000);

        Timer timer2 = new Timer();
        timer2.schedule(client2, 50, 5000);

        Timer timer3 = new Timer();
        timer3.schedule(client3, 50, 7000);

        Random random = new Random();

        try {
            for (int i = 0; i < 3; i++) {
                topic.addMessage("News " + i);
                Thread.sleep(random.nextInt(5000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer1.cancel();
        timer2.cancel();
        timer3.cancel();

    }

}
