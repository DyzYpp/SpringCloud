package com.dyz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApplication
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@SpringBootApplication
@EnableEurekaServer // 表明这是eureka的服务端
public class EurekaServerApplication {

   private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
        logger.info("----------Eureka注册中心服务端启动成功");
    }
}
