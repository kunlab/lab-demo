package com.kunlab.demo.Spring4.ioc.wiring.auto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author likun
 * @date 2021/5/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AppAnnotationTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }
}