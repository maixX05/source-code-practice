package com.msr.study.patterns.structural.decorator;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:45
 */

public class RedShapeDecorator extends AbstractShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Circle with red color");
    }
}
