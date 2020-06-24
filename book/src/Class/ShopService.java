package Class;

public class ShopService {
	private static ShopService service = new ShopService();
	
	private ShopService() {}
	
	static ShopService getIntstace() {
		return service;
	}
}
