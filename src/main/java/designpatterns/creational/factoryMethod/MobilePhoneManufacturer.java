package designpatterns.creational.factoryMethod;

public class MobilePhoneManufacturer {
	public static MobilePhone makeMobilePhone() {
		return new MobilePhone();
	}
}
