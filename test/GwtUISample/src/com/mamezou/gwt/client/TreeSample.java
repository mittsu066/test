package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TreeSample implements EntryPoint {

	public void onModuleLoad() {

		TreeItem treeItem = new TreeItem();
		treeItem.setText("[root]");
		treeItem.addTextItem("[item_0]");
		treeItem.addTextItem("[item_1]");
		treeItem.addTextItem("[item_2]");

		Tree tree = new Tree();
		tree.addItem(treeItem);

		RootPanel.get().add(tree);
	}
}
