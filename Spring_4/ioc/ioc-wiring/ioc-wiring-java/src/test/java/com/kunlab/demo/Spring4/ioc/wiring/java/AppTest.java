package com.kunlab.demo.Spring4.ioc.wiring.java;

import com.kunlab.demo.spring4.ioc.wiring.java.CDPlayer;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CDPlayer anotherCDPlayer;

    @Test
    public void cdPlayerShouldNotNull() {
        assertNotNull(cdPlayer);
    }

    @Test
    public void anotherCDPlayerShouldNotNull() {
        assertNotNull(anotherCDPlayer);
    }
}