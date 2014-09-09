package com.troy.pattern.observer;

import java.util.List;

public class Button extends Component {

	@Override
	public void doAction() {
		List<Listener> observers = this.getListeners();
		for (Listener listener : observers) {
			listener.actionPerformed();
		}
	}

}
