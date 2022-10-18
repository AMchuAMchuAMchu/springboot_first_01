package com.itheima;

import com.itheima.config.MpConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {MpConfig.class})
public class SpringbootMybatisPlus01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlus01Application.class, args);
    }

}
