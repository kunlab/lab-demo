package com.kunlab.Spring5.aop.aspectJ.annotation;

import org.springframework.stereotype.Component;

/**
 * @author likun
 * @date 2021/5/7
 */
@Component
public class Girl implements IBuy{

    @Override
    public String buy(double price) {
        System.out.println(String.format("女孩花%s元买了一只布娃娃。", price));
        return "布娃娃";
    }
}
