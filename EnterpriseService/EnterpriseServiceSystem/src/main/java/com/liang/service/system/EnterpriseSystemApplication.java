package com.liang.service.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Liang
 * 2022-08-21
 */
@MapperScan("com.liang.service.system.**.mapper")
@SpringBootApplication
@ComponentScan({"com.liang.service.system", "com.liang.common"})
public class EnterpriseSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseSystemApplication.class, args);
    }
}
