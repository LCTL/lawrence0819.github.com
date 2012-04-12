public class Main {

	public static void main(String[] args) {

		Cache.setCacheImplClass(TreeMapCache.class);
		Cache cache = Cache.getInstance();
		Cache cache2 = Cache.getInstance();

		System.out.println(cache);
		System.out.println(cache == cache2);

		cache.put("test", "Object");
		
		System.out.println(cache2.get("test"));

	}

}
