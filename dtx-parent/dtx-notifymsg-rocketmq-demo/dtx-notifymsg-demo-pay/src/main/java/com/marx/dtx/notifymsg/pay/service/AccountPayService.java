package com.marx.dtx.notifymsg.pay.service;

import com.marx.dtx.notifymsg.pay.entity.AccountPay;

public interface AccountPayService {

	/**
	 * 充值
	 */
	AccountPay insertAccountPay(AccountPay accountPay);

	/**
	 * 查询充值结果
	 */
	AccountPay getAccountPay(String txNo);
}
