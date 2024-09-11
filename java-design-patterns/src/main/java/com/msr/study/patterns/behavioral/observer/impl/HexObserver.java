package com.msr.study.patterns.behavioral.observer.impl;

import com.msr.study.patterns.behavioral.observer.Observer;
import com.msr.study.patterns.behavioral.observer.Subject;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
