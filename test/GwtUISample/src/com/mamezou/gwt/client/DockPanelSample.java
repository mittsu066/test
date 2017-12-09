package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DockPanelSample implements EntryPoint {

	public void onModuleLoad() {
	    DockPanel dockPanel = new DockPanel();
	    
	    SimplePanel panel_1 = new SimplePanel();
	    panel_1.add(new Button("North:上"));
	    SimplePanel panel_2 = new SimplePanel();
	    panel_2.add(new Button("South:下"));
	    SimplePanel panel_3 = new SimplePanel();
	    panel_3.add(new Button("East:右"));
	    SimplePanel panel_4 = new SimplePanel();
	    panel_4.add(new Button("West:左"));
	    SimplePanel panel_5 = new SimplePanel();
	    panel_5.add(new Button("Center:中央"));
	    
	    dockPanel.add(panel_1, DockPanel.NORTH);
	    dockPanel.add(panel_2, DockPanel.SOUTH);
  		dockPanel.add(panel_3, DockPanel.EAST);
		dockPanel.add(panel_4, DockPanel.WEST);
		dockPanel.add(panel_5, DockPanel.CENTER);
	    
	    RootPanel.get().add(dockPanel);
	}
}
