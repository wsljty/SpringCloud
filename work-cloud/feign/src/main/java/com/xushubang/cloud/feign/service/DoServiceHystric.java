package com.xushubang.cloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class DoServiceHystric implements DoServiceHi {
    @Override
    public String doServiceSayHi(String name) {
        return "sorry,操你妈的访问服务不到或者是钞票坏死，我们他也不知道为什么"+name;
    }
}
