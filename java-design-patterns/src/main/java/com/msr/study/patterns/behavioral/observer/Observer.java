package com.msr.study.patterns.behavioral.observer;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
