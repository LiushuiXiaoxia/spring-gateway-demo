package cn.mycommons.service1.controller;

import cn.mycommons.service1.feign.ITest2FeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController <br/>
 * Created by xiaqiulei on 2020-08-01.
 */
@Slf4j
@RestController
@RequestMapping("/test1")
public class Test1Controller {

    @Autowired
    ITest2FeignApi feignApi;

    @RequestMapping
    public Object test() {
        Object o = feignApi.test();
        log.info("test " + o);
        return o;
    }
}
