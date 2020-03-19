package com.eiletxie.springcloud.alibaba.service;


/**
 * @Author EiletXie
 * @Since 2020/3/18 22:58
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
