package com.xushubang.cloud.feign;

import com.xushubang.cloud.feign.service.DoServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@ComponentScan(value = "com.xushubang.cloud.feign.service")
public class FeignApplication {

    @Autowired
    DoServiceHi doServiceHi;

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @RequestMapping(value="/hi")
    public String sayHiControl(@RequestParam(value = "name")String name){
        return doServiceHi.doServiceSayHi(name);
    }

}
