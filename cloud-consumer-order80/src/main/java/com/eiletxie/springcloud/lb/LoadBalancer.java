package com.eiletxie.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author EiletXie
 * @Since 2020/3/11 12:22
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);


}
