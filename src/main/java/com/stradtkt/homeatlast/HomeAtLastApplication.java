package com.stradtkt.homeatlast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HomeAtLastApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeAtLastApplication.class, args);
    }

}
