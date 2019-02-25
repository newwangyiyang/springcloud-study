package cn.yiyang.eurekafeign.controller;

import cn.yiyang.eurekafeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019/2/24 20:53
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    @GetMapping("/getHello")
    public String getHello() {
        return helloService.getHello();
    }
}
