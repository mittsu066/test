package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HyperlinkSample implements EntryPoint, HistoryListener  {

	private Label label = new Label();

	public void onModuleLoad() {

		Hyperlink link_A = new Hyperlink("リンクA", "A");
	    Hyperlink link_B = new Hyperlink("リンクB", "B");
	    Hyperlink link_C = new Hyperlink("リンクC", "C");

	    String initToken = History.getToken();
	    if (initToken.length() == 0) {
	      initToken = "A";
	    }

	    onHistoryChanged(initToken);

	    VerticalPanel panel = new VerticalPanel();
	    panel.add(label);
	    panel.add(link_A);
	    panel.add(link_B);
	    panel.add(link_C);
	    
	    RootPanel.get().add(panel);

	    History.addHistoryListener(this);
	}

	public void onHistoryChanged(String historyToken) {
		label.setText("履歴トークン: " + historyToken);
	}
}
