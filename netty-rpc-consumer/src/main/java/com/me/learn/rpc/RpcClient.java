/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.rpc;

import com.me.learn.ICustomerService;

/**
 * Description:
 *
 * @Author: Jed Li
 * Created: 2021/9/17
 **/
public class RpcClient {
    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        final ICustomerService iCustomerService = rpcClientProxy.clientProxy(ICustomerService.class, "127.0.0.1", 9090);
        System.out.println(iCustomerService.createCustomer("Jed li"));
    }
}
