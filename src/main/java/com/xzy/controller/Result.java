package com.xzy.controller;

/**
 * @Project_Name: springmvc-ssm
 * @Description: 前后端数据传输协议实现
 * @User: "XuZhaoYang"
 * @Date: 2023/1/22 21:38
 */
public class Result {
    private Object data;
    private Integer code;
    private String msg;

    // 提供构造方法


    public Result() {
    }

    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data,  String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
