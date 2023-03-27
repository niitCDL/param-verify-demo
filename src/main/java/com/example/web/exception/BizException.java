package com.example.web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Slf4j
public class BizException {

    @ExceptionHandler({ParamNotMatchException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(ParamNotMatchException exception) {
        log.info("自定义异常处理-ParamNotMatchException");
        ModelAndView m = new ModelAndView();
        m.addObject("exception", exception.getMessage());
        m.setViewName("error/500");
        return m;
    }

}
