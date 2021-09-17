/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.rpc;

import com.me.learn.rpc.protocol.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.me.learn.rpc.spring", "com.me.learn.rpc.service"})
@SpringBootApplication
public class NettyRpcProvider {
    public static void main(String[] args) {
        SpringApplication.run(NettyRpcProvider.class, args);
        new NettyServer("127.0.0.1", 9090).startNettyServer();
    }
}
