package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ScrollPanelSample implements EntryPoint {

	public void onModuleLoad() {
		HorizontalPanel horizontalPanel = new HorizontalPanel();
	    
		horizontalPanel.add(new Button("1番目"));
		horizontalPanel.add(new Button("2番目"));
		horizontalPanel.add(new Button("3番目"));
		horizontalPanel.add(new Button("4番目"));
		horizontalPanel.add(new Button("5番目"));
		horizontalPanel.add(new Button("6番目"));

		ScrollPanel scrollPanel = new ScrollPanel(horizontalPanel);
		scrollPanel.setAlwaysShowScrollBars(true);

	    RootPanel.get().add(scrollPanel);
	}
}
