package com.iot.cloud.springaopdemo.service.impl;

import com.iot.cloud.springaopdemo.handle.AopHandle;
import com.iot.cloud.springaopdemo.service.AopService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Version: 1.0
 * @Description:
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company 厦门立林科技有限公司
 * @Author: hj
 * @date: 2022-07-27 14:14
 * @history:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class AopServiceImplTest {
    @Autowired
    private AopHandle aopHandle;
    @Test
    void test1() {
        int test = aopHandle.handle("123");
        log.info("test={}", test);
    }
}