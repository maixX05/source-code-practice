package com.msr.study.patterns.structural.decorator;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:47
 */

public class DecoratorTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        AbstractShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        AbstractShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        shape.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
