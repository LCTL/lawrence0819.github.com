import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        NewsTopic topic = new NewsTopic();

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        
        topic.registerObserver(client1);
        topic.registerObserver(client2);
        topic.registerObserver(client3);
        
        Random random = new Random();

        try {
            for (int i = 0; i < 3; i++) {
                topic.pushMessage("News " + i);
                Thread.sleep(random.nextInt(5000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
