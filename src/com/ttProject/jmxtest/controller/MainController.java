package com.ttProject.jmxtest.controller;

import com.ttProject.jmxtest.GuiEntry;
import com.ttProject.jmxtest.jmx.JMXFactory;
import com.ttProject.jmxtest.target.TestObject;

/**
 * 中心となるコントローラー
 * @author taktod
 */
public class MainController {
	private GuiEntry parent;
	public MainController(GuiEntry parent) {
		this.parent = parent;
	}
	public void registerJMX() {
		JMXFactory.registerMBean(new TestObject(), parent.getRegisterJMXField().getText());
	}
	public void removeJMX() {
		JMXFactory.unregisterMBean(new TestObject(), parent.getRemoveJMXField().getText());
	}
}
