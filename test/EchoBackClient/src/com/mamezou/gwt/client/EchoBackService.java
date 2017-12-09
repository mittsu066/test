package com.mamezou.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface EchoBackService extends RemoteService {
	public String echoback(String msg);
}
