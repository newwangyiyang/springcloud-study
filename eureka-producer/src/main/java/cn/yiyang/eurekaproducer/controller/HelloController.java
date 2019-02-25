package cn.yiyang.eurekaproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019/2/24 20:45
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/getHello")
    public String getHello(){
        return "hello";
    }
}
