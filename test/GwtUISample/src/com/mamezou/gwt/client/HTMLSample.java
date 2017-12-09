package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HTMLSample implements EntryPoint {

	public void onModuleLoad() {

	    Label label = new Label("単純なテキストです。");
	    HTML html = new HTML(
	    	"<b>HTML</b>を含むテキストです。<h3>HTML形式が有効です。</h3>", true);
	  
	    VerticalPanel panel = new VerticalPanel();
	    panel.add(label);
	    panel.add(html);
	    
	    RootPanel.get().add(panel);
	}
}
