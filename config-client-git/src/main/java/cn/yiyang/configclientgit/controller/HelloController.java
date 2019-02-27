package cn.yiyang.configclientgit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019/2/27 20:24
 * @Description:
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    String hello;

    @GetMapping("/getHello")
    public String getHello() {
        return hello;
    }
}
