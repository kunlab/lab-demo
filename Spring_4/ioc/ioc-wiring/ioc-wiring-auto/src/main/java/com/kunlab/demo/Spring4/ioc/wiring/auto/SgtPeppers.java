package com.kunlab.demo.Spring4.ioc.wiring.auto;

import org.springframework.stereotype.Component;

/**
 * @author likun
 * @date 2021/5/19
 */
@Component
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("Spring auto wiring");
    }
}
