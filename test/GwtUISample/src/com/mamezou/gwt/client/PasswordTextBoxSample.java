package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.KeyboardListenerAdapter;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PasswordTextBoxSample implements EntryPoint {

	public void onModuleLoad() {
	    PasswordTextBox passwordTextBox = new PasswordTextBox();

	    passwordTextBox.addKeyboardListener(new KeyboardListenerAdapter() {
	      public void onKeyPress(Widget sender, char keyCode, int modifiers) {
	        if (!Character.isLetterOrDigit(keyCode)) {
	          ((PasswordTextBox) sender).cancelKey();
	        }
	      }
	    });
	    
	    RootPanel.get().add(passwordTextBox);
	}
}
