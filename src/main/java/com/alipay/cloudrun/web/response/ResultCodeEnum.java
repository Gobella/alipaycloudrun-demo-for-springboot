/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.cloudrun.web.response;

/**
 * 错误码枚举
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS("SUCCESS", "成功"),

    /**
     * 数据库异常
     */
    DATAACCESS_ERROR("DATAACCESS_ERROE", "数据库异常,请检查db连接")
    ;

    /**
     * 错误码
     */
    private final String resultCode;

    /**
     * 错误信息
     */
    private final String resultMessage;

    /**
     * 创建一个ErrorCodeEnum
     * @param errorCode 错误码
     * @param errorMessage 错误信息
     */
    private ResultCodeEnum(String errorCode, String errorMessage) {
        this.resultCode = errorCode;
        this.resultMessage = errorMessage;
    }

    /**
     * Getter method for property <tt>resultCode</tt>.
     *
     * @return property value of resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Getter method for property <tt>resultMessage</tt>.
     *
     * @return property value of resultMessage
     */
    public String getResultMessage() {
        return resultMessage;
    }
}
