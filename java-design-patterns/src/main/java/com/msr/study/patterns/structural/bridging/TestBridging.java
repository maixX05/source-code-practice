package com.msr.study.patterns.structural.bridging;

import com.msr.study.patterns.structural.bridging.impl.Circle;
import com.msr.study.patterns.structural.bridging.impl.GreenCircle;
import com.msr.study.patterns.structural.bridging.impl.RedCircle;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class TestBridging {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
