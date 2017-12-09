package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class VerticalPanelSample implements EntryPoint {

	public void onModuleLoad() {
		VerticalPanel verticalPanel = new VerticalPanel();
	    
	    SimplePanel panel_1 = new SimplePanel();
	    panel_1.add(new Button("1番目"));
	    SimplePanel panel_2 = new SimplePanel();
	    panel_2.add(new Button("2番目"));
	    SimplePanel panel_3 = new SimplePanel();
	    panel_3.add(new Button("3番目"));
	    
	    verticalPanel.add(panel_2);
	    verticalPanel.add(panel_3);
	    verticalPanel.insert(panel_1, 0);
	    
	    RootPanel.get().add(verticalPanel);
	}
}
