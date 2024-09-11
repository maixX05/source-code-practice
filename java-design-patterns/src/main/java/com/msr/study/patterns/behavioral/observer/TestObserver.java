package com.msr.study.patterns.behavioral.observer;

import com.msr.study.patterns.behavioral.observer.impl.BinaryObserver;
import com.msr.study.patterns.behavioral.observer.impl.HexObserver;
import com.msr.study.patterns.behavioral.observer.impl.OctalObserver;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
