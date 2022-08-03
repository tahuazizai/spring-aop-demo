package com.iot.cloud.springaopdemo.aspect;

import com.iot.cloud.springaopdemo.annotation.DistributeLock;
import org.springframework.aop.MethodMatcher;

import java.lang.reflect.Method;

/**
 * @version: 1.00.00
 * @description: 方法匹配
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 13:48
 */
public class MyMethodMatcher implements MethodMatcher {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        DistributeLock annotation = method.getAnnotation(DistributeLock.class);
        //判断方法是否使用了MyAnnotation注解。
        if (annotation != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isRuntime() {
        return false;
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        return false;
    }
}
