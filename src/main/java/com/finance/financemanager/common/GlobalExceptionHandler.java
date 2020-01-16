package com.finance.financemanager.common;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.finance.financemanager.controller")
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Api errorException(Exception e) {
        e.printStackTrace();
        log.error("全局异常：" + e.getMessage());
        return Api.error(e.getMessage());
    }
}
