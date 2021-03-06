package com.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1. 整合mybatis-plus
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *
 * 2. 配置
 *      1) 配置数据源:
 *          导入数据库驱动
 *          yml配置数据源
 *      2) 配置mybatis-plus:
 *          mapperScan
 *          xml位置
 *
* */


@EnableDiscoveryClient
@MapperScan("com.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
