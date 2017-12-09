package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.Accessibility;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FocusPanelSample implements EntryPoint {

	public void onModuleLoad() {

		FocusPanel focusPanel = new FocusPanel();
		focusPanel.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				Window.alert("FocusPanelがクリックされました");
			}
		});
		
		TreeItem treeItem = new TreeItem();
		treeItem.setText("[root]");
		treeItem.addTextItem("[item_0]");
		treeItem.addTextItem("[item_1]");

		Tree tree = new Tree();
		tree.addItem(treeItem);
		
		focusPanel.add(tree);

		RootPanel.get().add(focusPanel);
	}
}
