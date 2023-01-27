package com.xzy.exception;

/**
 * @Project_Name: springmvc-ssm
 * @Description:
 * @User: "XuZhaoYang"
 * @Date: 2023/1/22 22:57
 */
public class BusinessException extends RuntimeException{
     private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BusinessException(Integer cod, Throwable cause) {
        super(cause);
        this.code = code;
    }


}
