package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LoadListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ImageSample implements EntryPoint {

	  private Label label = new Label();

	  public void onModuleLoad() {
	    Image image = new Image();

	    image.addLoadListener(new LoadListener() {
	      public void onLoad(Widget sender) {
	    	  label.setText("ロード処理済");
	      }
	      public void onError(Widget sender) {
	    	  label.setText("ロード処理失敗");
	      }
	    });
	    label.setText("ロード処理中...");
	    image.setUrl("http://www.mamezou.com/images/logo.gif");
  	  	label.setText("ロード処理済");

	    VerticalPanel panel = new VerticalPanel();
	    panel.add(label);
	    panel.add(image);
	    
	    RootPanel.get().add(panel);
	  }
}
