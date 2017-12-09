package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.TabListener;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TabBarSample implements EntryPoint {

	public void onModuleLoad() {

		TabBar tabBar = new TabBar();
		tabBar.addTab("[TabBar_1]");
		tabBar.addTab("[TabBar_2]");
		tabBar.addTab("[TabBar_3]");

		tabBar.addTabListener(new TabListener() {
			public void onTabSelected(SourcesTabEvents sender, int index) {
				Window.alert("クリック対象: " + index);
			}
		    
			public boolean onBeforeTabSelected(SourcesTabEvents sender, int index) {
				return index == 2 ? false : true;
			}
		});

		RootPanel.get().add(tabBar);
	}
}
