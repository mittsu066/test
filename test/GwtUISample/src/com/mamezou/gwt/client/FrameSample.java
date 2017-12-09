package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FrameSample implements EntryPoint {

	public void onModuleLoad() {

		Frame frame = new Frame("http://www.mamezou.com/");
		frame.setHeight("300");
		frame.setWidth("450");

	    RootPanel.get().add(frame);
	}
}
