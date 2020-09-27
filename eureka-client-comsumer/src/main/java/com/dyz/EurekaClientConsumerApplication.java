package com.dyz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EurekaClientConsumerApplication
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@EnableFeignClients
@SpringBootApplication
public class EurekaClientConsumerApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaClientConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class);
        logger.info("---------Eureka客户端 消费者启动成功");
    }
}
