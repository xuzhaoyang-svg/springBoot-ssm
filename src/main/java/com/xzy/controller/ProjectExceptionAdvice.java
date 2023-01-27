package com.xzy.controller;

import com.xzy.exception.BusinessException;
import com.xzy.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Project_Name: springmvc-ssm
 * @Description:
 * @User: "XuZhaoYang"
 * @Date: 2023/1/22 22:28
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception){

        return new Result(exception.getCode(), null, exception.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception){

        return new Result(exception.getCode(), null, exception.getMessage());
    }
    // 拦截所有异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception){
        System.out.println("有异常");
        return new Result(Code.UNKNOWN_ERR, null, "有异常");
    }
}
