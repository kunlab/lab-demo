package com.kunlab.demo.spring4.ioc.wiring.java;

/**
 * @author likun
 * @date 2021/5/19
 */
public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer(){}

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(String flag) {
        cd.play(flag);
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
