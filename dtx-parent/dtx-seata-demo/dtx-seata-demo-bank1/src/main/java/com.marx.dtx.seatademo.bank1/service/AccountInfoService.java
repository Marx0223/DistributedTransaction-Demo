package com.marx.dtx.seatademo.bank1.service;

/**
 * Created by Marx.
 */
public interface AccountInfoService {

    //张三扣减金额
    void updateAccountBalance(String accountNo, Double amount);
}
