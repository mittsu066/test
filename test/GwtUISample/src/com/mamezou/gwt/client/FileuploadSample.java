package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FileuploadSample implements EntryPoint {

	public void onModuleLoad() {
		final FormPanel form = new FormPanel();
		form.setAction("/serviceHandler");	//サービス未定義
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);

		VerticalPanel panel = new VerticalPanel();
		form.setWidget(panel);

		final FileUpload upload = new FileUpload();
		upload.setName("fileUploadForm");
		panel.add(upload);

		panel.add(new Button("Submit", new ClickListener() {
		  public void onClick(Widget sender) {
		    form.submit();
		  }
		}));

		form.addFormHandler(new FormHandler() {
		  public void onSubmitComplete(FormSubmitCompleteEvent event) {
		    // Submit完了後に呼び出されます
		    Window.alert(event.getResults());
		  }
		  public void onSubmit(FormSubmitEvent event) {
		    // Submitが実行される前に呼び出されます
		    if (upload.getFilename().length() == 0) {
		      Window.alert("FileName is empty.");
		      event.setCancelled(true);
		    }
		  }
	  });

      RootPanel.get().add(form);
	}
}
