package cn.yiyang.eurekafeign.service.impl;

import cn.yiyang.eurekafeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2019/2/25 19:54
 * @Description:
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "this is fallback";
    }
}
