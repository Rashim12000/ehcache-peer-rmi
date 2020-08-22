package com.f1soft.zuul.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Rashim Dhaubanjar
 */

@EnableCaching
@SpringBootApplication
public class ServerTwoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServerTwoApplication.class, args);
    }
}
