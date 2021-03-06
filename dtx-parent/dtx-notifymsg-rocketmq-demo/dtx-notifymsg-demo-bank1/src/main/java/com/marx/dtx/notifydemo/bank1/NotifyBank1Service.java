package com.marx.dtx.notifydemo.bank1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"com.marx.dtx.notifydemo.bank1.spring"})
public class NotifyBank1Service {

	public static void main(String[] args) {
		SpringApplication.run(NotifyBank1Service.class, args);
	}

}
