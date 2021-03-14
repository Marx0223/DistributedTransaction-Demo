package com.marx.dtx.tccdemo.bank1.spring;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Marx.
 */
@FeignClient(value = "tcc-demo-bank2", fallback = Bank2ClientFallback.class)
public interface Bank2Client {
	// 远程调用李四的微服务，通过@Hmily将张三的全局事务信息带到李四微服务中
	@GetMapping("/bank2/transfer")
	@Hmily
	Boolean transfer(@RequestParam("amount") Double amount);
}
