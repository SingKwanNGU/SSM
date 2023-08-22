package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect{
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}

//    @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int,int))")
    @Before("pointCut()")
    public void  beforeAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法："+signature.getName()+",参数："+ Arrays.toString(args));
    }

    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法："+signature.getName()+",执行完毕");
    }

    @AfterReturning(value = "pointCut()" ,returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法："+signature.getName()+",返回值："+result);
    }

    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint)  {
        Object result=null;
        try {
            System.out.println("环绕通知——>前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知——>返回通知");
        } catch (Throwable e) {
            System.out.println("环绕通知——>异常通知");
            throw new RuntimeException(e);
        }finally {
            System.out.println("环绕通知——>后置通知");
        }
            return result;
    }


}
