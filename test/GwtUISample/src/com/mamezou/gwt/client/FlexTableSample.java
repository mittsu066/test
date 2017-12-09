package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FlexTableSample implements EntryPoint {

	public void onModuleLoad() {

	    FlexTable flexTable = new FlexTable();

	    flexTable.setText(0, 0, "[0, 0]");
	    flexTable.setText(0, 1, "[0, 1]");
	    flexTable.setText(0, 2, "[0, 2]");
	    
	    flexTable.setText(1, 0, "[1, 0]");
	    flexTable.setText(1, 1, "[1, 1]");
	    flexTable.setText(1, 2, "[1, 2]");

	    flexTable.setWidget(2, 0, new Button("[2, 0]"));
	    flexTable.setWidget(2, 1, new Button("[2, 1]"));
	    flexTable.setWidget(2, 2, new Button("[2, 2]"));
	    flexTable.getFlexCellFormatter().setColSpan(2, 0, 2);

	    RootPanel.get().add(flexTable);
	}
}
