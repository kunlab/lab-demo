package com.kunlab.Spring5.aop.aspectJ.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring IOC 自动部署
 * @author likun
 * @date 2021/4/30
 */
@Configuration
@ComponentScan(basePackageClasses = {IBuy.class})
@EnableAspectJAutoProxy(proxyTargetClass = true) //启用AOP功能
public class AppConfig {
}
