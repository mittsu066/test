package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HTMLPanelSample implements EntryPoint {

	public void onModuleLoad() {
		
		HTMLPanel htmlPanel = new HTMLPanel(
				"HTMLPanel <h3>HTML形式が有効です。</h3>");
	    
	    RootPanel.get().add(htmlPanel);
	}
}
