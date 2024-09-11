package com.msr.study.patterns.structural.bridging;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public abstract class Shape {
    protected IDrawApi drawApi;

    protected Shape(IDrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 抽象方法
     */
    public abstract void draw();
}
