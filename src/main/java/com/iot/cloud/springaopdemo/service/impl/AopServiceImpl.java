package com.iot.cloud.springaopdemo.service.impl;

import com.iot.cloud.springaopdemo.annotation.DistributeLock;
import com.iot.cloud.springaopdemo.service.AopService;
import org.springframework.stereotype.Service;

/**
 * @version: 1.00.00
 * @description: aop服务
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 14:11
 */
@Service
public class AopServiceImpl implements AopService {
    @Override
    @DistributeLock(lockName = "123")
    public int test(String name) {
        return 1;
    }
}
