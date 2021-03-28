package com.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient
public interface HelloFeignService {
    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
