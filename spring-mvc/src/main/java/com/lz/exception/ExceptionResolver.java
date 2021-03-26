package com.lz.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LY
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //1.验证一下是不是刚刚捕获的异常
        ModelAndView mv=new ModelAndView();
        if(e instanceof MyException){
            //说明Controller出现了问题
            mv.addObject("errorMessage",e.getMessage());
            mv.setViewName("error.jsp");
        }
        return mv;
    }
}
