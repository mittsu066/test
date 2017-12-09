package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MenuBarSample implements EntryPoint {

	public void onModuleLoad() {
		Command command = new Command() {
		  public void execute() {
		    Window.alert("項目が選択されました。");
		  }
		};

		MenuBar menu_A = new MenuBar(true);
		menu_A.addItem("item_A1", command);
		menu_A.addItem("item_A2", command);
		menu_A.addItem("item_A3", command);

		MenuBar menu_B = new MenuBar(true);
		menu_B.addItem("item_B1", command);
		menu_B.addItem("item_B2", command);
		menu_B.addItem("item_B3", command);

		MenuBar menu_C = new MenuBar(true);
		menu_C.addItem("item_C1", command);
		menu_C.addItem("item_C2", command);
		menu_C.addItem("item_C3", command);

		MenuBar mainMenu = new MenuBar();
		mainMenu.addItem("menu_A", menu_A);
		mainMenu.addItem("menu_B", menu_B);
		mainMenu.addItem("menu_C", menu_C);

		RootPanel.get().add(mainMenu);
	}
}
