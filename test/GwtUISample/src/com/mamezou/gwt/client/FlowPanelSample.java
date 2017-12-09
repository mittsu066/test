package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FlowPanelSample implements EntryPoint {

	public void onModuleLoad() {
		FlowPanel flowPanel = new FlowPanel();
	    
	    flowPanel.add(new Button("1番目"));
	    flowPanel.add(new Button("2番目"));
	    flowPanel.add(new Button("3番目"));
	    flowPanel.add(new Button("4番目"));	 
	    
	    RootPanel.get().add(flowPanel);
	}
}
