package com.zhouzifei.tool.exception;

/**
 * @author 周子斐 (17600004572@163.com)
 * @date 2019/12/14 16:23
 */

public class M3u8Exception extends ServiceException {
    public M3u8Exception() {
        super();
    }

    public M3u8Exception(String message) {
        super(message);
    }

    public M3u8Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
