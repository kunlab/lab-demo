package com.kunlab.demo.Spring4.ioc.wiring.auto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author likun
 * @date 2021/5/19
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用 SpringJUnit4ClassRunner 创建Spring文
@ContextConfiguration(value={"classpath:applicationContext.xml"}) //@ContextConfiguration 加载配置信息
public class AppXmlTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }
}