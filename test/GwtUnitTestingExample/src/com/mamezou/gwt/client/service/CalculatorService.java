package com.mamezou.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;

public interface CalculatorService extends RemoteService {
	/**
	 * xとyの二つの値を受け取り、その和を返す。
	 * 
	 * @param x 足される数
	 * @param y 足す数
	 * @return 和
	 */
	public int add(int x, int y);
}
