package com.wx.restaurant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Controller
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@MapperScan(basePackages = "com.wx.restaurant.mybatis.mapper")
@EnableScheduling
public class RestaurantApplication {
    //TODO: 改微信后台的服务器，以使真机连接到服务器上
    //TODO: 询问是否需要真机使用。
    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }
}
