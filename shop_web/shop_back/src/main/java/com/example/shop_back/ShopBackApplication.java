package com.example.shop_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class ShopBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopBackApplication.class, args);
    }

}
