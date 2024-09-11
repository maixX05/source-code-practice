package com.msr.study.patterns.behavioral.observer.impl;

import com.msr.study.patterns.behavioral.observer.Observer;
import com.msr.study.patterns.behavioral.observer.Subject;

/**
 *
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
