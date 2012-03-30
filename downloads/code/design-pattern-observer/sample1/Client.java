import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimerTask;

public class Client extends TimerTask {

    private final Set<String> displayedIds = new HashSet<String>();

    private NewsTopic topic;

    public Client(NewsTopic topic) {
        this.topic = topic;
    }

    public void displayNews() {
        Map<String, String> messages = topic.getMessages();
        if (!displayedIds.containsAll(messages.keySet())) {
            for (Entry<String, String> entry : messages.entrySet()) {
                if (!displayedIds.contains(entry.getKey())) {
                    System.out.println(String.format(
                            "Client %s display message: %s at time: %s",
                            Integer.toHexString(this.hashCode()),
                            entry.getValue(), new Date()));
                    displayedIds.add(entry.getKey());
                }
            }
        }
    }

    @Override
    public void run() {
        displayNews();
    }

}
