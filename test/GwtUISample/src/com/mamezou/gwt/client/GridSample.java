package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GridSample implements EntryPoint {

	public void onModuleLoad() {

		Grid grid = new Grid(4, 4);

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				String text = "[" + row + ", " + col + "]";
				if (col != 2) {
					grid.setText(row, col, text);
				} else {
					grid.setWidget(row, col, new Button(text));					
				}
			}
		}
		grid.getCellFormatter().setWidth(0, 2, "64px");

		RootPanel.get().add(grid);
	}
}
