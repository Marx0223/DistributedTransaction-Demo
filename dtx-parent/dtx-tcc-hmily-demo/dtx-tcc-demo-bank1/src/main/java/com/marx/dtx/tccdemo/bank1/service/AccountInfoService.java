package com.marx.dtx.tccdemo.bank1.service;

/**
 * Created by Marx.
 */
public interface AccountInfoService {

    //账户扣款
    public  void updateAccountBalance(String accountNo, Double amount);
}
