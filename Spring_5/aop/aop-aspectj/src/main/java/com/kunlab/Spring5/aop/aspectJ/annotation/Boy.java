package com.kunlab.Spring5.aop.aspectJ.annotation;

import org.springframework.stereotype.Component;

/**
 * @author likun
 * @date 2021/4/30
 */
@Component
public class Boy implements IBuy {

    public String buy(double price) {
        System.out.println(String.format("男孩花%s元买了一个游戏机", price));
        if(price<2)
            throw new IllegalArgumentException("金额太小");
        return "游戏机";
    }
}
