package com.kunlab.demo.spring4.ioc.wiring.java;

/**
 * @author likun
 * @date 2021/5/19
 */
public class SgtPeppers implements CompactDisc{
    public void play(String flag) {
        System.out.println(String.format("Spring Java Wiring: %s", flag));
    }
}
