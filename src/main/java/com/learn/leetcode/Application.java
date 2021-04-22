package com.learn.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author juzhi
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Customize the spring config location
        System.setProperty("spring.config.additional-location",
                "全局变量测试");

        // Run application
        SpringApplication.run(Application.class, args);
    }
}
