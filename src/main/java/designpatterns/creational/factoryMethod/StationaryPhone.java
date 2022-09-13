package designpatterns.creational.factoryMethod;

public class StationaryPhone extends Phone{

	@Override
	public void makeCall() {
		System.out.println("Трубка снята");
		System.out.println("Длинный гудок");
		System.out.println("Набран номер");
		System.out.println("Идут гудки");
		System.out.println();
	}

	@Override
	public void getCall() {
		System.out.println("Трубка снята");
		System.out.println("Звонок принят");
		System.out.println();
	}

	@Override
	public void endCall() {
		System.out.println("Трубка положена");
		System.out.println("Звонок завершён");
		System.out.println();
	}
}
