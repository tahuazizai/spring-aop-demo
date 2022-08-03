package com.iot.cloud.springaopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @version: 1.00.00
 * @description: 前置通知
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 13:53
 */
@Slf4j
public class MyAdvise implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("前置通知");
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("环绕前");
        Object proceed = invocation.proceed();
        log.info("环绕后");
        return proceed;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("后置通知");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        log.info("异常通知:" + e.getMessage());
    }
}
