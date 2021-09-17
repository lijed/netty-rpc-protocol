/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.rpc.contants;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/9/16
 **/
public enum SerialType {

    JSON_SERIAL((byte)1),
    JAVA_SERIAL((byte)2);

    private byte code;
    SerialType(byte code) {
        this.code = code;
    }

    public byte code() {
        return code;
    }
}
