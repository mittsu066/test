package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DialogBoxSample implements EntryPoint, ClickListener {

	  private static class SampleDialog extends DialogBox {
		  public SampleDialog() {
			  setText("SampleDialog");
			  setWidget(new Label("SampleDialogの表示です。"));
		  }
	  }

	  public void onModuleLoad() {
		  Button button = new Button("DialogBox表示");
		  button.addClickListener(this);

		  RootPanel.get().add(button);
	  }

	  public void onClick(Widget sender) {
		  new SampleDialog().show();
	  }
}
