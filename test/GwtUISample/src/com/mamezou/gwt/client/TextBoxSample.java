package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.KeyboardListenerAdapter;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TextBoxSample implements EntryPoint {

	public void onModuleLoad() {
	    TextBox textBox = new TextBox();

	    textBox.addKeyboardListener(new KeyboardListenerAdapter() {
	      public void onKeyPress(Widget sender, char keyCode, int modifiers) {
	        if (!Character.isDigit(keyCode)) {
	          // 数字以外を入力された場合には入力をキャンセルする
	          ((TextBox)sender).cancelKey();
	        }
	      }
	    });

	    RootPanel.get().add(textBox);
	}
}
