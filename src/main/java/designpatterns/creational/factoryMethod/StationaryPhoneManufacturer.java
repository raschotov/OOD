package designpatterns.creational.factoryMethod;

public class StationaryPhoneManufacturer {
	public static StationaryPhone makeMobilePhone() {
		return new StationaryPhone();
	}
}
