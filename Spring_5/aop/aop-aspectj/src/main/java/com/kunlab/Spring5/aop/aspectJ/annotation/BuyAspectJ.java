package com.kunlab.Spring5.aop.aspectJ.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 定义一个切面
 * @author likun
 * @date 2021/4/30
 */
@Aspect
@Component
public class BuyAspectJ {

    /**
     * 定义切入点 @Pointcut
     * 切点：com.kunlab.Spring5.aop.aspectJ.annotation.IBuy.buy()
     * AspectJ切点指示器 execution(); 方法返回类型：任何类型（*） 方法参数：任意参数（..）
     */
    @Pointcut("execution(* com.kunlab.Spring5.aop.aspectJ.annotation.IBuy.buy(..))")
    public void point() {
    }

    /**
     * 通知类型 @Before
     */
    @Before("point()")
    public void before(){
        System.out.println("Before...");
    }

    @After("point()")
    public void after(){
        System.out.println("After...");
    }

    @AfterReturning("point()")
    public void afterReturing(){
        System.out.println("AfterReturing...");
    }

    @AfterThrowing("point()")
    public void afterThrowing() {
        System.out.println("AfterThrowing...");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint pj) {
        try {
            System.out.println("Around start...");
            pj.proceed();
            System.out.println("Around finish.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
