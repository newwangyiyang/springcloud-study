package cn.yiyang.eurekafeign.service;

import cn.yiyang.eurekafeign.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Administrator
 * @Date: 2019/2/24 20:51
 * @Description:
 */
@FeignClient(value = "eureka-producer", fallback = HelloServiceImpl.class)
public interface HelloService {
    @GetMapping("/getHello")
    String getHello();
}
