package com.eiletxie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author EiletXie
 * @Since 2020/3/10 19:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006.class,args);
    }
}
