package designpatterns.behavioral.mediator;

import designpatterns.behavioral.mediator.components.*;
import designpatterns.behavioral.mediator.mediator.Editor;
import designpatterns.behavioral.mediator.mediator.Mediator;

import javax.swing.*;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
	public static void main(String[] args) {
		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}
}