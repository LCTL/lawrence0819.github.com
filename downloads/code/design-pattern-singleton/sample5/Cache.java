public abstract class Cache {

    private static class InstanceHolder {

        private static Cache instance;
        static {
            try {
                instance = (Cache) cacheImplClass.getMethod("getInstance").invoke(null);
            } catch (Exception e) {
                System.out.println(cacheImplClass + ".getInstance throw exception: " + e.toString());
                System.out.println("Use default cache " + HashMapCache.class);
                instance = HashMapCache.getInstance();
            }
        }

    }

    private static Class<? extends Cache> cacheImplClass;

    public abstract Object get(String key);

    public abstract void put(String key, Object value);

    public static Cache getInstance() {
        return InstanceHolder.instance;
    }

    public final static void setCacheImplClass(Class<? extends Cache> cacheImplClass) {
        if (Cache.cacheImplClass == null)
            Cache.cacheImplClass = cacheImplClass;
        else
        	new IllegalArgumentException("Cache implementation class already exist");
    }

}
