package com.iot.cloud.springaopdemo.aspect;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.stereotype.Component;

/**
 * @version: 1.00.00
 * @description: 自定义切面
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 13:31
 */
@Component
public class MyAdvisor implements PointcutAdvisor {
    /**
     * 定义切点
     * @return
     */
    @Override
    public Pointcut getPointcut() {
//        //自定义切入点表达式
//        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
//        pointcut.setExpression("execution(* com.iot.cloud.springaopdemo.service.AopService.*(..))");
//        //基于method级别的注解
//        AnnotationMatchingPointcut annotationMatchingPointcut = AnnotationMatchingPointcut.forMethodAnnotation(DistributeLock.class);
//        //基于class级别的注解
//        AnnotationMatchingPointcut pointcut1 = AnnotationMatchingPointcut.forClassAnnotation(DistributeLock.class);
        return new MyPointCut();
    }

    /**
     * 定义通知
     * @return
     */
    @Override
    public Advice getAdvice() {
        return new MyAdvise();
    }

    @Override
    public boolean isPerInstance() {
        return true;
    }
}
