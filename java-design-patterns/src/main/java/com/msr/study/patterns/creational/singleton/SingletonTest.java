package com.msr.study.patterns.creational.singleton;

import com.msr.study.patterns.creational.simplefactory.JavaVideo;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 10:16
 * @version: v1.0
 */

public class SingletonTest {

    public static void main(String[] args) throws Exception {
        SingletonHunger singletonHunger1 = SingletonHunger.getInstance1("zhangsan", "15");
        SingletonHunger singletonHunger2 = SingletonHunger.getInstance1("lisi", "15");
        System.out.println(singletonHunger1 == singletonHunger2);
        System.out.println("======================================");
        SingletonLazy instance1 = SingletonLazy.getInstanceByDCL("msr", "22");
        SingletonLazy instance2 = SingletonLazy.getInstanceByDCL("MaiShuRen", "22");
        System.out.println(instance1 == instance2);
        System.out.println("====================");
        //反射 反序列化 会破坏单列
        SingletonLazy holder1 = SingletonLazy.getInstanceByHolder("msr", "22");
        SingletonLazy holder2 = SingletonLazy.getInstanceByHolder("msr", "22");
        System.out.println(holder1 == holder2);
        System.out.println("==============================");
        try {
            SingletonHolder clone = ObjectCloneUtil.clone(SingletonHolder.getInstanceByHolder());
            System.out.println(clone == SingletonHolder.getInstanceByHolder());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("===========================");
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                Object bean2 = SingletonRegistryContainer.getBean("com.msr.study.patterns.creational.singleton.SingletonRegistryContainer");
//                System.out.println(bean2);
//            },"thread"+i).start();
//        }
//        Object bean1 = SingletonRegistryContainer.getBean("com.msr.study.patterns.creational.singleton.SingletonRegistryContainer");
//        System.out.println(bean1==bean2);
        System.out.println("=====================");

        System.out.println(SingletonThreadLocal.getInstance());
        System.out.println(SingletonThreadLocal.getInstance());
        System.out.println(SingletonThreadLocal.getInstance());
        System.out.println(SingletonThreadLocal.getInstance());
        System.out.println(SingletonThreadLocal.getInstance());

        System.out.println("================================");
        System.out.println(SingletonRegistryEnum.getInstance()==SingletonRegistryEnum.getInstance());
        SingletonRegistryEnum instance = SingletonRegistryEnum.getInstance();
        instance.setData(new Object());
        SingletonRegistryEnum clone = ObjectCloneUtil.clone(instance);
        System.out.println(clone.getData()==instance.getData());
        Class<?> aClass = Class.forName(SingletonRegistryEnum.class.getName());
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);

        SingletonRegistryEnum o = (SingletonRegistryEnum) constructor.newInstance();
        System.out.println(o==instance);
    }
}
