package com.kunlab.demo.spring4.ioc.wiring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author likun
 * @date 2021/5/19
 */
@Configuration //表明这是一个配置类
public class CDPlayerConfig {

    @Bean(name = "sgtPeppers") //声明简单的bean
    public SgtPeppers sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers()); //通过调用声明bean方法注入依赖，sgtPeppers() 是单例
    }

    @Bean //通过传递依赖bean的参数，Spring 自动将依赖注入进来
    public CDPlayer anotherCDPlayer(CompactDisc cd) {
        CDPlayer anotherCDPlayer = new CDPlayer();
        anotherCDPlayer.setCd(cd);
        return anotherCDPlayer;
    }
}
