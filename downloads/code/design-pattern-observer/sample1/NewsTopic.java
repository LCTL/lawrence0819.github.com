import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class NewsTopic {

    private final Map<String, String> messages = new HashMap<String, String>();

    public Map<String, String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        // Assign unique ID to each message for determine is it old message.
        messages.put(UUID.randomUUID().toString(), message);
    }

}
