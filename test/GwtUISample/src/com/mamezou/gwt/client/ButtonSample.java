package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ButtonSample implements EntryPoint {

  public void onModuleLoad() {
    Button button = new Button("検索", new ClickListener() {
      public void onClick(Widget sender) {
        Window.alert("ここで検索");
	  }
	});
	// root panelへの追加
    RootPanel.get().add(button);
  }
}
