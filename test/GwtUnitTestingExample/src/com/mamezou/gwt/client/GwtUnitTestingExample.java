package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.KeyboardListenerAdapter;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamezou.gwt.client.service.CalculatorService;
import com.mamezou.gwt.client.service.CalculatorServiceAsync;

/**
 * Example - CHAPTER 04 
 */
public class GwtUnitTestingExample implements EntryPoint {

	private final TextBox arg1 = new TextBox();

	private final TextBox arg2 = new TextBox();

	private final Button add = new Button("add");

	private final Label result = new Label();

	public void onModuleLoad() {
		arg1.addKeyboardListener(new KeyboardListenerAdapter() {
			public void onKeyPress(Widget sender, char keyCode, int modifiers) {
				if (!Character.isDigit(keyCode) && keyCode != '\b') {
					((TextBox) sender).cancelKey();
				}
			}

			public void onKeyUp(Widget sender, char keyCode, int modifiers) {
				updateAppearance();
			}
		});
		arg2.addKeyboardListener(new KeyboardListenerAdapter() {
			public void onKeyPress(Widget sender, char keyCode, int modifiers) {
				if (!Character.isDigit(keyCode)) {
					((TextBox) sender).cancelKey();
				}
			}

			public void onKeyUp(Widget sender, char keyCode, int modifiers) {
				updateAppearance();
			}
		});
		add.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				CalculatorServiceAsync proxy = (CalculatorServiceAsync) GWT
						.create(CalculatorService.class);
				ServiceDefTarget entrypoint = (ServiceDefTarget) proxy;
				String moduleRelatedURL = GWT.getModuleBaseURL() + "calculator";
				entrypoint.setServiceEntryPoint(moduleRelatedURL);

				AsyncCallback callback = new AsyncCallback() {
					public void onSuccess(Object res) {
						result.setText(res.toString());
					}

					public void onFailure(Throwable caught) {
						Window.alert(caught.getMessage());
					}
				};
				proxy.add(Integer.parseInt(arg1.getText()), Integer
						.parseInt(arg2.getText()), callback);
			}
		});
		updateAppearance();
		RootPanel.get().add(arg1);
		RootPanel.get().add(arg2);
		RootPanel.get().add(add);
		RootPanel.get().add(result);
	}

	/**
	 * 各Widgetの内容に応じて状態を制御する.
	 */
	void updateAppearance() {
		if (arg1.getText().length() == 0) {
			arg2.setEnabled(false);
			add.setEnabled(false);
		} else if (arg2.getText().length() == 0) {
			arg2.setEnabled(true);
			add.setEnabled(false);
		} else {
			arg2.setEnabled(true);
			add.setEnabled(true);
		}
	}

	Button getAdd() {
		return add;
	}

	TextBox getArg1() {
		return arg1;
	}

	TextBox getArg2() {
		return arg2;
	}

	Label getResult() {
		return result;
	}
}

