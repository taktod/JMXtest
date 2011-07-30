package com.ttProject.jmxtest.controller;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

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
	public void changeSkin(String skinName) {
		String className = null;
		for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()) {
			if(lafInfo.getName().equals(skinName)) {
				className = lafInfo.getClassName();
				break;
			}
		}
		if(className == null) {
			System.out.println(skinName + "データが見つかりませんでした。");
			System.out.println("スキンデータ変更できませんでした。");
			return;
		}
		try {
			UIManager.setLookAndFeel(className);
			SwingUtilities.updateComponentTreeUI(parent);
		}
		catch (Exception e) {
			System.out.println("スキンの設定に失敗しました。");
			e.printStackTrace();
		}
	}
}
