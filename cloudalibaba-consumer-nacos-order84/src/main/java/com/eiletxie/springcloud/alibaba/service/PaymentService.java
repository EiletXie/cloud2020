package com.eiletxie.springcloud.alibaba.service;

import com.eiletxie.springcloud.entities.CommonResult;
import com.eiletxie.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author EiletXie
 * @Since 2020/3/18 14:53
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult< Payment > paymentSQL(@PathVariable("id") Long id);

}
