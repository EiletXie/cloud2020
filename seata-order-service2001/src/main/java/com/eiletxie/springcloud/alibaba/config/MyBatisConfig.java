package com.eiletxie.springcloud.alibaba.config;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author EiletXie
 * @Since 2020/3/18 21:13
 */
@Configuration
@MapperScan({"com.eiletxie.springcloud.alibaba.dao"})
public class MyBatisConfig {


}
