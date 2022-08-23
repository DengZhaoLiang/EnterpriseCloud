package com.liang.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.liang")
@ComponentScan(basePackages = "com.liang")
@MapperScan("com.liang.service.base.**.mapper")
@SpringBootApplication
public class EnterpriseServiceBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseServiceBaseApplication.class, args);
    }

}
