package com.xushubang.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="cloud-eureka-client",fallback = DoServiceHystric.class)
public interface DoServiceHi {

    @RequestMapping(value="/hi")
    String doServiceSayHi(@RequestParam(value="name")String name);
}
