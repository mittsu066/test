package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.StackPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class StackPanelSample implements EntryPoint {

	public void onModuleLoad() {
		
	    StackPanel stackPanel = new StackPanel();
	    
	    stackPanel.add(new Label("Label_1"), "[Label_1]");
	    stackPanel.add(new Label("Label_2"), "[Label_2]");
	    stackPanel.add(new Label("Label_3"), "[Label_3]");

	    RootPanel.get().add(stackPanel);
	}
}
