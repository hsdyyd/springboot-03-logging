package com.train.springboot.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {


    @Test
    public void contextLoads() {
        // 日志记录器
        Logger logger = LoggerFactory.getLogger(getClass());
        // 日志级别:trace>debug>info>warn>error
        // 日志的默认级别为:info，只会输出>=info级别的日志
        // 可以调整日志的输出级别
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");

    }

}

