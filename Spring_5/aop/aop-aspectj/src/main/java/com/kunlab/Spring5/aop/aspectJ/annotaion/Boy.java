package com.kunlab.Spring5.aop.aspectJ.annotaion;

import org.springframework.stereotype.Component;

/**
 * @author likun
 * @date 2021/4/30
 */
@Component
public class Boy implements IBuy {

    public String buy(double price) {
        System.out.println(String.format("男孩花了%s元买了一个游戏机", price));
        return "游戏机";
    }
}
