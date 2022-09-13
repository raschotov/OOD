package designpatterns.creational.factoryMethod;

public class PhoneManufacturer {
	public static Phone makePhone(String type) {
		if (type.equals("mobile")) {
			return new MobilePhone();
		} else if (type.equals("stationary")) {
			return new StationaryPhone();
		} else {
			System.out.println("Неопознанный тип телефона");
		}
		return null;
	}
}
