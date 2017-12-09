package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RootPanelSample implements EntryPoint {

	public void onModuleLoad() {

		Button bottun = new Button("検索");
		
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(bottun);
	}
}
