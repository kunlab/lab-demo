package com.kunlab.Spring5.aop.aspectJ.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author likun
 * @date 2021/4/30
 */
public class AppTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Boy boy = context.getBean("boy", Boy.class);
        boy.buy(2);
    }
}
