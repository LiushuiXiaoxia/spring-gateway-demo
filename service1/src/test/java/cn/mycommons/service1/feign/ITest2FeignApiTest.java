package cn.mycommons.service1.feign;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ITest2FeignApiTest <br/>
 * Created by xiaqiulei on 2020-08-01.
 */
@Slf4j
@SpringBootTest
public class ITest2FeignApiTest {

    @Autowired
    ITest2FeignApi feignApi;

    @Test
    public void test1() {
        log.info("result = {}", feignApi.test());
    }
}