import java.util.HashMap;
import java.util.Map;

public class Cache {

    private final Map<String, Object> container;

    private Cache() {
        container = new HashMap<String, Object>();
    }

    public Object get(String key) {
        return container.get(key);
    }

    public void put(String key, Object value) {
        container.put(key, value);
    }

    public static Cache getInstance() {
        return InstanceHolder.instance;
    }
    
    private static class InstanceHolder {

        private static final Cache instance = new Cache();

    }

}
