package com.iot.cloud.springaopdemo.aspect;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

/**
 * @version: 1.00.00
 * @description: 自定义pointCut
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 13:45
 */
public class MyPointCut implements Pointcut {
    /**
     * 用于过滤类，先过滤类，如果类不满足，
     * 那么就不会判断方法是否匹配
     * @return
     */
    @Override
    public ClassFilter getClassFilter() {
        return ClassFilter.TRUE;
    }

    /**
     * 用于过滤方法，需要一个MyMethodMatcher用于方法逻辑判断
     * @return
     */
    @Override
    public MethodMatcher getMethodMatcher() {
        return new MyMethodMatcher();
    }
}
