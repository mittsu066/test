package com.mamezou.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;

public interface CalculatorService extends RemoteService {
	/**
	 * x��y�̓�̒l���󂯎��A���̘a��Ԃ��B
	 * 
	 * @param x ������鐔
	 * @param y ������
	 * @return �a
	 */
	public int add(int x, int y);
}
