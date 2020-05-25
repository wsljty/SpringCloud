package com.xushubang.cloud.feign;

import com.xushubang.cloud.feign.service.DoServiceHi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignApplicationTests {

    @Autowired
    DoServiceHi doServiceHi;

    @Test
    public void contextLoads() {
        System.out.println("====================================================");
        System.out.println(doServiceHi.doServiceSayHi("mmfdsmafmdsmafmdsafsd"));

    }

}
