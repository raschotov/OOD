package designpatterns.creational.singleton;

public class Singleton {
	private static Singleton instance;
	private String value;

	private Singleton(){
		this.value = "default value";
	}

	public static Singleton getInstance() {
		if (instance.equals(null)) {
			instance = new Singleton();
		}
		return instance;
	}
}
