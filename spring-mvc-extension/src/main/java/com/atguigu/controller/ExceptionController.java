package com.atguigu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
