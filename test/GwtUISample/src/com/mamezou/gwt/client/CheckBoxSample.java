package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CheckBoxSample implements EntryPoint {

	public void onModuleLoad() {
	    CheckBox checkBox = new CheckBox("チェックボックス");
	    checkBox.setChecked(true);

	    checkBox.addClickListener(new ClickListener() {
	      public void onClick(Widget sender) {
	        boolean checked = ((CheckBox) sender).isChecked();
	        Window.alert(checked ? "チェックあり" : "チェックなし");
	      }
	    });

	    RootPanel.get().add(checkBox);
	}
}
