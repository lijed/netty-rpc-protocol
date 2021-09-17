/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.rpc;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/9/17
 **/
public class RpcClientProxy {

    public  <T> T clientProxy(Class<T> clazz, String serverAddress, int portNumber) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, new RpcClientInvocationHandler(serverAddress, portNumber));
    }
}
