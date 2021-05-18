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
    @Pointcut("execution(* com.kunlab.Spring5.aop.aspectJ.annotation.IBuy.buy(..)) && within(Girl)")
    public void point() {
    }

    /**
     * 通知类型(前置) @Before
     * 同 @Before("execution(* com.kunlab.Spring5.aop.aspectJ.annotation.IBuy.buy(..))")
     */
    @Before("point()")
    public void before(){
        System.out.println("Before...");
    }

    /**
     * 通知类型（后置）@After
     */
    @After("point()")
    public void after(){
        System.out.println("After...");
    }

    /**
     * 通知类型（后置返回结果后执行）
     */
    @AfterReturning("point()")
    public void afterReturing(){
        System.out.println("AfterReturing...");
    }

    /**
     * 通知类型（后置抛出异常后执行）
     */
    @AfterThrowing("point()")
    public void afterThrowing() {
        System.out.println("AfterThrowing...");
    }

    /**
     * 通知类型（环绕通知）
     * @param pj 必须有
     */
    @Around("point()")
    public void around(ProceedingJoinPoint pj) {
        try {
            System.out.println("Around start...");
            pj.proceed(); //调用对应的目标类方法
            System.out.println("Around finish.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
