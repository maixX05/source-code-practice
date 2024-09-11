package com.msr.study.patterns.structural.decorator;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:41
 */

abstract class AbstractShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public AbstractShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
