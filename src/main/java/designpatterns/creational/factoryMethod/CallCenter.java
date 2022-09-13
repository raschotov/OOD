package designpatterns.creational.factoryMethod;

public class CallCenter {
	public static void main(String[] args) {
		Phone phone1 = PhoneManufacturer.makePhone("mobile");
		Phone phone2 = PhoneManufacturer.makePhone("stationary");

		assert phone1 != null;
		System.out.println("Использован мобильный телефон");
		phone1.makeCall();
		phone1.endCall();
		phone1.getCall();
		phone1.endCall();

		assert phone2 != null;
		System.out.println("Использован стационарный телефон");
		phone2.makeCall();
		phone2.endCall();
		phone2.getCall();
		phone2.endCall();
	}
}
