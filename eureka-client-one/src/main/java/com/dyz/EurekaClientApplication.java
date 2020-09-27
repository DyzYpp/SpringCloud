package com.dyz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EurekaClientApplication
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@SpringBootApplication
public class EurekaClientApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class);
        logger.info("----------Eureka客服端启动成功");
    }
}
