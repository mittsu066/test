package com.mamezou.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CalculatorServiceAsync {
	public void add(int x, int y, AsyncCallback callback);
}
