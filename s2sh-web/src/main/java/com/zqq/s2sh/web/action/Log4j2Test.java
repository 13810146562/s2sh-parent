package com.zqq.s2sh.web.action;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author zqq
 * @Date 2019/10/2  12:08
 */
@Component("log4j2")
@Aspect
public class Log4j2Test {
    private Logger logger = LoggerFactory.getLogger(Log4j2Test.class);

    @Pointcut("execution(java.lang.String com.zqq.s2sh.web.action.*Action.*()) &&"
            + "!execution(java.lang.String com.zqq.s2sh.web.action.*Action.set*()) &&"
            + "!execution(java.lang.String com.zqq.s2sh.web.action.*Action.get*())")
    private void logPoint() {
    }

    @Before("logPoint()")
    public void beforeLog() {
        logger.info("接收请求，开始处理请求");
    }
}
