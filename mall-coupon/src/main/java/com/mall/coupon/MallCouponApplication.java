package com.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用Nacos作为配置中心管理配置
 * 1. 引入依赖
 *
     <dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
     </dependency>
 2. 创建bootstrap.properties
     spring.application.name=nacos-config-example
     spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 3. 在配置中心添加数据集 mall-coupon.properties
 4. 在数据集添加配置信息
 5. 动态获取并刷新配置配置
        @RefreshScope: 动态获取并刷新配置配置
        如果配置中心和当前应用的配置文件都包含配置信息，优先从配置中心获取


 * 每个微服务创建自己的命名空间，使用配置分组区分环境 dev, test prod

  * */


@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
