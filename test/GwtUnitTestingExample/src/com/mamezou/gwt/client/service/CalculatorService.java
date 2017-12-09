package com.mamezou.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;

public interface CalculatorService extends RemoteService {
	/**
	 * x‚Æy‚Ì“ñ‚Â‚Ì’l‚ğó‚¯æ‚èA‚»‚Ì˜a‚ğ•Ô‚·B
	 * 
	 * @param x ‘«‚³‚ê‚é”
	 * @param y ‘«‚·”
	 * @return ˜a
	 */
	public int add(int x, int y);
}
