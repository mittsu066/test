package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TreeItemSample implements EntryPoint {

	public void onModuleLoad() {

		TreeItem rootItem = new TreeItem();
		rootItem.setText("[root]");
		rootItem.addTextItem("[item_0]");
		rootItem.addTextItem("[item_1]");
		rootItem.addTextItem("[item_2]");
		
		TreeItem childItem_0 = rootItem.getChild(0);
		TreeItem childItem_0_0 = new TreeItem();
		childItem_0_0.setText("[item_0_0]");
		TreeItem childItem_0_1 = new TreeItem();
		childItem_0_1.setText("[item_0_1]");
		childItem_0.addItem(childItem_0_0);
		childItem_0.addItem(childItem_0_1);

		Tree tree = new Tree();
		tree.addItem(rootItem);

		RootPanel.get().add(tree);
	}
}
