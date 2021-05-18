package com.kunlab.Spring5.aop.aspectj.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author likun
 * @date 2021/5/10
 */
public class AppConfigTest {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBuy boy = (IBuy) context.getBean("targetObject");
        boy.buy(2);
    }
}
