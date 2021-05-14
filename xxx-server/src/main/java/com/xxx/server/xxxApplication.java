package com.xxx.server;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.xxx.server
 * 启动类
 *
 * @author gongjunbo
 * @date 2021/5/14
 */
@SpringBootApplication
@MapperScan("com.xxx.server.mapper")
public class xxxApplication {

    public static void main(String[] args) {
        SpringApplication.run(xxxApplication.class,args);

    }

}
