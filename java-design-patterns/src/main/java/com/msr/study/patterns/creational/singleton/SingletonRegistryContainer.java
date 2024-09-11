package com.msr.study.patterns.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 13:37
 * @version: v1.0
 */

public class SingletonRegistryContainer {

    private static final Map<String, Object> IOC = new ConcurrentHashMap<>();

    private static Lock lock = new ReentrantLock();

    private SingletonRegistryContainer() {
    }

    /**
     * 借鉴
     *
     * @param className
     * @return
     */
    public static Object getBean(String className) {
        Object obj;
        if (!IOC.containsKey(className)) {
            lock.lock();
            try {
                if (!IOC.containsKey(className)) {
                    obj = Class.forName(className).newInstance();
                    IOC.put(className, obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        return IOC.get(className);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Object bean2 = SingletonRegistryContainer.getBean("com.msr.study.patterns.creational.singleton.SingletonRegistryContainer");
                System.out.println(bean2);
            }, "thread" + i).start();
        }
    }

}
