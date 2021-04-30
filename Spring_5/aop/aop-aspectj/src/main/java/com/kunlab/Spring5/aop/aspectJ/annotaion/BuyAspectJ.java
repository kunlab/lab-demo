package com.kunlab.Spring5.aop.aspectJ.annotaion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
     * 定义切入点和通知
     * 切点：com.kunlab.Spring5.aop.aspectJ.annotaion.IBuy.buy()
     * 通知类型 @Before
     *
     * AspectJ切点指示器 execution(); 方法返回类型：任何类型（*） 方法参数：任意参数（..）
     */
    @Before("execution(* com.kunlab.Spring5.aop.aspectJ.annotaion.IBuy.buy(..))")
    public void before(){
        System.out.println("孩子们都买了自己喜欢的东西");
    }
}
