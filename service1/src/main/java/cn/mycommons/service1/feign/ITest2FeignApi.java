package cn.mycommons.service1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ITest2FeignApi <br/>
 * Created by xiaqiulei on 2020-08-01.
 */
@FeignClient(name = "service2")
public interface ITest2FeignApi {

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    Object test();
}