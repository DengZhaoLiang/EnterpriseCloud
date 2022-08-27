package com.liang.service.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Liang
 * 2022-08-21
 */
@MapperScan("com.liang.service.system.**.mapper")
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.liang.service.system", "com.liang.common"})
@EnableCaching
public class EnterpriseSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseSystemApplication.class, args);
    }
}
