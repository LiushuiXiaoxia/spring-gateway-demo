package cn.mycommons.service2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * TestController <br/>
 * Created by xiaqiulei on 2020-08-01.
 */
@Slf4j
@RestController
@RequestMapping("/test2")
public class Test2Controller {

    @RequestMapping
    public Object test() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "hello world");

        log.info("map = {}", map);
        return map;
    }
}
