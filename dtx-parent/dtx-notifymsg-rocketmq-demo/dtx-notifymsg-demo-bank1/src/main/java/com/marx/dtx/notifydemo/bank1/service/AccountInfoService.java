package com.marx.dtx.notifydemo.bank1.service;

import com.marx.dtx.notifydemo.bank1.entity.AccountPay;
import com.marx.dtx.notifydemo.bank1.model.AccountChangeEvent;

public interface AccountInfoService {

	/**
	 * 更新账户金额
	 */
	void updateAccountBalance(AccountChangeEvent accountChange);

	/**
	 * 查询充值结果（远程调用）
	 */
	AccountPay queryPayResult(String tx_no);

}
