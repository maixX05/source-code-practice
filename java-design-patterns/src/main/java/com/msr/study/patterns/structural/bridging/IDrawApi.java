package com.msr.study.patterns.structural.bridging;

/**
 * 使抽象和实现分离，抽象和实现可以单独变化
 *
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public interface IDrawApi {
    /**
     * 画圆
     *
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
