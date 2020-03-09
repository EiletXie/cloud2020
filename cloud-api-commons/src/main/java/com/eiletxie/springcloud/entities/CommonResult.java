package com.eiletxie.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author EiletXie
 * @Since 2020/3/9 13:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}