package com.marx.dtx.notifymsg.pay.service.impl;

import com.marx.dtx.notifymsg.pay.dao.AccountPayDao;
import com.marx.dtx.notifymsg.pay.entity.AccountPay;
import com.marx.dtx.notifymsg.pay.service.AccountPayService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marx
 * @version 1.0
 **/
@Service
@Slf4j
public class AccountPayServiceImpl implements AccountPayService {

	@Autowired
	AccountPayDao accountPayDao;

	@Autowired
	RocketMQTemplate rocketMQTemplate;

	/**
	 * 插入充值记录
	 */
	@Override
	public AccountPay insertAccountPay(AccountPay accountPay) {
		int success = accountPayDao.insertAccountPay(accountPay.getId(), accountPay.getAccountNo(), accountPay.getPayAmount(), "success");
		if (success > 0) {

			log.info("充值系统充值成功：{}", accountPay);

			// 发送通知,使用普通消息发送通知
			accountPay.setResult("success");
			rocketMQTemplate.convertAndSend("topic_notifymsg", accountPay);
			return accountPay;
		}
		return null;
	}

	/**
	 * 查询充值记录，接收通知方调用此方法来查询充值结果
	 */
	@Override
	public AccountPay getAccountPay(String txNo) {
		AccountPay accountPay = accountPayDao.findByIdTxNo(txNo);
		return accountPay;
	}
}
