package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MenuItemSample implements EntryPoint {

	public void onModuleLoad() {
		Command command = new Command() {
		  public void execute() {
		    Window.alert("項目が選択されました。");
		  }
		};

		MenuBar menu_A = new MenuBar(true);
		MenuItem item_A1 = new MenuItem("item_A1", command);
		MenuItem item_A2 = new MenuItem("item_A2", command);
		MenuItem item_A3 = new MenuItem("item_A3", command);
		menu_A.addItem(item_A1);
		menu_A.addItem(item_A2);
		menu_A.addItem(item_A3);

		MenuBar menu_B = new MenuBar(true);
		MenuItem item_B1 = new MenuItem("<h1>item_B1</h1>", true, command);
		MenuItem item_B2 = new MenuItem("<h2>item_B2</h2>", true, command);
		MenuItem item_B3 = new MenuItem("<h3>item_B3</h3>", true, command);
		menu_B.addItem(item_B1);
		menu_B.addItem(item_B2);
		menu_B.addItem(item_B3);

		MenuBar mainMenu = new MenuBar();
		mainMenu.addItem("menu_A", menu_A);
		mainMenu.addItem("menu_B", menu_B);

		RootPanel.get().add(mainMenu);
	}
}
