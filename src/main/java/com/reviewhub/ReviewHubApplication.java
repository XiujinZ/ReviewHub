package com.reviewhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.reviewhub.mapper")
@SpringBootApplication
public class ReviewHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewHubApplication.class, args);
    }

}
