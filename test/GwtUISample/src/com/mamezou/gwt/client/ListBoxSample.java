package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ListBoxSample implements EntryPoint {

	public void onModuleLoad() {
	    ListBox listBox = new ListBox();
	    listBox.addItem("item_1");
	    listBox.addItem("item_2");
	    listBox.addItem("item_3");
	    listBox.addItem("item_4");
	    listBox.addItem("item_5");

	    listBox.setVisibleItemCount(6);
	    
	    RootPanel.get().add(listBox);
	}
}
