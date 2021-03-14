package com.marx.dtx.tccdemo.bank1.spring;

import org.springframework.stereotype.Component;

/**
 * @author Marx
 * @version 1.0
 **/
@Component
public class Bank2ClientFallback implements Bank2Client {

    @Override
    public Boolean transfer(Double amount) {

        return false;
    }
}
