package designpatterns.creational.factoryMethod;

public class MobilePhone extends Phone implements Callable{
	@Override
	public void makeCall(){
		System.out.println("Экран разблокирован");
		System.out.println("Открыта телефонная книга");
		System.out.println("Выбран контакт");
		System.out.println("Контакт вызван");
		System.out.println();
	}

	@Override
	public void getCall() {
		System.out.println("Экран разблокирован");
		System.out.println("Нажата кнопка \"Принять вызов\"");
		System.out.println("Звонок принят");
		System.out.println();
	}

	@Override
	public void endCall() {
		System.out.println("Нажата кнопка \"Завершить звонок\"");
		System.out.println("Звонок завершен");
		System.out.println("Экран заблокирован");
		System.out.println();
	}
}
