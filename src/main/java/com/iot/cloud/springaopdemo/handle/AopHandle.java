package com.iot.cloud.springaopdemo.handle;

import com.iot.cloud.springaopdemo.annotation.DistributeLock;
import org.springframework.stereotype.Component;

/**
 * @version: 1.00.00
 * @description: aop处理
 * @copyright: Copyright (c) 2022 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: hj
 * @date: 2022-07-27 14:40
 */
@Component
public class AopHandle {
    @DistributeLock(lockName = "123")
    public int handle(String name) {
       return 1234;
    }
}
