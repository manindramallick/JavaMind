package pack;

public class AppThreadLocal {

	private static ThreadLocal<AppContext> applocal = new ThreadLocal<>();
	
	public static void setContext(AppContext appContext) {
		applocal.set(appContext);
	}
	
	public static AppContext getContext() {
		
		return applocal.get();
	}
	
	public static void removeContext() {
		applocal.remove();
	}
	
}
