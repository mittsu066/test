package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CompositeSample implements EntryPoint {

	private static class CompositeTextBox extends Composite implements
		ClickListener {

		private TextBox textBox = new TextBox();
		private CheckBox checkBox = new CheckBox();

		public CompositeTextBox(String caption) {
			VerticalPanel panel = new VerticalPanel();
			panel.add(checkBox);
			panel.add(textBox);

			checkBox.setText(caption);
			checkBox.setChecked(true);
			checkBox.addClickListener(this);

			initWidget(panel);
			setStyleName("mz-CompositeTextBox");
		}

		public void onClick(Widget sender) {
			if (sender == checkBox) {
				textBox.setEnabled(checkBox.isChecked());
			}
		}

		public void setText(String text) {
			textBox.setText(text);
		}

		public String getText() {
			return textBox.getText();
		}
	}

	public void onModuleLoad() {
		CompositeTextBox compositeTextBox = 
			new CompositeTextBox("チェック状態で使用可能");
		compositeTextBox.setText("TextBox初期値");
		
		RootPanel.get().add(compositeTextBox);
	}
}
