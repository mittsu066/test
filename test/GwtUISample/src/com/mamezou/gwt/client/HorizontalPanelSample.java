package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HorizontalPanelSample implements EntryPoint {

	public void onModuleLoad() {
		HorizontalPanel horizontalPanel = new HorizontalPanel();
	    
	    SimplePanel panel_1 = new SimplePanel();
	    panel_1.add(new Button("1番目"));
	    SimplePanel panel_2 = new SimplePanel();
	    panel_2.add(new Button("2番目"));
	    SimplePanel panel_3 = new SimplePanel();
	    panel_3.add(new Button("3番目"));
	    
	    horizontalPanel.add(panel_2);
	    horizontalPanel.add(panel_3);
	    horizontalPanel.insert(panel_1, 0);
	    
	    RootPanel.get().add(horizontalPanel);
	}
}
