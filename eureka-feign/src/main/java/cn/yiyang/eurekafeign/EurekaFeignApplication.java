package cn.yiyang.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableCircuitBreaker
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
