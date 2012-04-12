import java.util.HashMap;
import java.util.Map;

public class HashMapCache extends Cache {

    private final Map<String, Object> container;

    private HashMapCache() {
        container = new HashMap<String, Object>();
    }

    @Override
    public Object get(String key) {
        return container.get(key);
    }

    @Override
    public void put(String key, Object value) {
        container.put(key, value);
    }

    public static Cache getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {

        private static final Cache instance = new HashMapCache();

    }

}
