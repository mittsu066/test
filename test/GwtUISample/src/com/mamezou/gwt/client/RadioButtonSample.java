package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RadioButtonSample implements EntryPoint {

	public void onModuleLoad() {
	    RadioButton radioButtun_1 = new RadioButton("RadioButtonGroup", "Button_1");
	    RadioButton radioButtun_2 = new RadioButton("RadioButtonGroup", "Button_2");
	    RadioButton radioButtun_3 = new RadioButton("RadioButtonGroup", "Button_3");

	    radioButtun_1.setChecked(true);

	    ClickListener listener = new ClickListener() {
		      public void onClick(Widget sender) {
			        String checkedButton = ((RadioButton) sender).getText();
			        Window.alert(checkedButton + "がチェックされました");
			  }
			};
		radioButtun_1.addClickListener(listener);
		radioButtun_2.addClickListener(listener);
		radioButtun_3.addClickListener(listener);

		FlowPanel panel = new FlowPanel();
	    panel.add(radioButtun_1);
	    panel.add(radioButtun_2);
	    panel.add(radioButtun_3);

	    RootPanel.get().add(panel);
	}
}
