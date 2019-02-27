package cn.yiyang.servicetrubine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ServiceTrubineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTrubineApplication.class, args);
    }

}
