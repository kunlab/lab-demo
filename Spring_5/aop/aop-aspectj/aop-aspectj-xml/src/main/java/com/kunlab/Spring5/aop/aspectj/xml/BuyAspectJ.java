package com.kunlab.Spring5.aop.aspectj.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 定义一个切面
 * @author likun
 * @date 2021/4/30
 */
public class BuyAspectJ {


    /**
     * 通知类型(前置) @Before
     */
    public void before(){
        System.out.println("Before...");
    }

    /**
     * 通知类型（后置）@After
     */
    public void after(){
        System.out.println("After...");
    }

    /**
     * 通知类型（后置返回结果后执行）
     */
    public void afterReturing(){
        System.out.println("AfterReturing...");
    }

    /**
     * 通知类型（后置抛出异常后执行）
     */
    public void afterThrowing() {
        System.out.println("AfterThrowing...");
    }

    /**
     * 通知类型（环绕通知）
     * @param pj 必须有
     */
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
