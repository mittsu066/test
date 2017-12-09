package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EchoBackClient implements EntryPoint {
	/** メッセージ入力フィールド */
	private TextBox msgBox = new TextBox();
	/** メッセージ送信ボタン */
	private Button sendBtn = new Button("send to");
	/** 結果表示領域 */
	private ListBox results = new ListBox();

	public void onModuleLoad() {

		sendBtn.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				// プロキシオブジェクトを取得
				EchoBackServiceAsync proxy = (EchoBackServiceAsync) GWT
						.create(EchoBackService.class);
				// サービスへのエントリポイントを設定
				ServiceDefTarget entrypoint = (ServiceDefTarget) proxy;
				String path = GWT.getModuleBaseURL();
				entrypoint.setServiceEntryPoint(path+"echoback");

				// echobackサービスの結果への反応を定義
				AsyncCallback callback = new AsyncCallback() {
					public void onSuccess(Object result) {
						results.addItem((String) result);
					}

					public void onFailure(Throwable caught) {
						results.addItem(caught.getMessage());
					}
				};
				
				// サービスの呼び出し
				proxy.echoback(msgBox.getText(), callback);
			}
		}); // end of sendBtn.addClickListener

		// UIの構築
		Panel panel = new VerticalPanel();
		panel.add(new Label("message: "));
		panel.add(msgBox);
		panel.add(sendBtn);
		panel.add(new Label("results: "));
		panel.add(results);
		results.setMultipleSelect(true);
		RootPanel.get().add(panel);
	}
}
