package com.msr.study.patterns.structural.bridging.impl;

import com.msr.study.patterns.structural.bridging.IDrawApi;
import com.msr.study.patterns.structural.bridging.Shape;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, IDrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
