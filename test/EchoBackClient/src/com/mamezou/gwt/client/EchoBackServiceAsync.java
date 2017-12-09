package com.mamezou.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EchoBackServiceAsync {
	public void echoback(String msg, AsyncCallback callback);
}
