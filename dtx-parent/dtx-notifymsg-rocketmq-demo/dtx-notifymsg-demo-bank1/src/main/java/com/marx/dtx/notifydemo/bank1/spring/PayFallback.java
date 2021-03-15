package com.marx.dtx.notifydemo.bank1.spring;

import com.marx.dtx.notifydemo.bank1.entity.AccountPay;
import org.springframework.stereotype.Component;

/**
 * @author Marx
 * @version 1.0
 **/
@Component
public class PayFallback implements PayClient {
	@Override
	public AccountPay payresult(String txNo) {
		AccountPay accountPay = new AccountPay();
		accountPay.setResult("fail");
		return accountPay;
	}
}
