package designpatterns.behavioral.mediator.components;

import designpatterns.behavioral.mediator.mediator.Mediator;
/**
 * Общий интерфейс компонентов.
 */
public interface Component {
	void setMediator(Mediator mediator);
	String getName();
}