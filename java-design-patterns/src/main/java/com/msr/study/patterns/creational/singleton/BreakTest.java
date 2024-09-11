package com.msr.study.patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 23:31
 */

public class BreakTest {

    public static void main(String[] args) {
        try {
            System.out.println("==========破坏饿汉式==========");
            //通过提供的接口去获取对象
            SingletonHunger instance = SingletonHunger.getInstance();
            //反射破坏
            Class<?> aClass = Class.forName(SingletonHunger.class.getName());
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            //反射获取
            SingletonHunger reflectObj = (SingletonHunger) constructor.newInstance();
            System.out.println(reflectObj == instance);
            //反序列化破坏
            SingletonHunger clone = ObjectCloneUtil.clone(instance);
            System.out.println(clone == instance);

            System.out.println("==========破坏DCL==========");
            //通过提供的接口去获取对象
            SingletonLazy instance2 = SingletonLazy.getInstanceByDCL("张三", "16");
            //反射破坏
            Class<?> aClass2 = Class.forName(SingletonLazy.class.getName());
            Constructor<?> constructor2 = aClass2.getDeclaredConstructor();
            constructor2.setAccessible(true);
            SingletonLazy reflectObj2 = (SingletonLazy) constructor2.newInstance();
            System.out.println(reflectObj2 == instance2);
            //反序列化破坏
            SingletonLazy clone2 = ObjectCloneUtil.clone(instance2);
            System.out.println(clone2 == instance2);

            System.out.println("==========破坏静态内部类==========");
            SingletonHolder instance3 = SingletonHolder.getInstanceByHolder();
            Class<?> aClass3 = Class.forName(SingletonHolder.class.getName());
            Constructor<?> constructor3 = aClass3.getDeclaredConstructor();
            constructor3.setAccessible(true);
            SingletonHolder reflectObj3 = (SingletonHolder) constructor3.newInstance();
            System.out.println(instance3 == reflectObj3);

            SingletonHolder clone3 = ObjectCloneUtil.clone(instance3);
            instance3.setObject(new Object());
            System.out.println(clone3 == instance3);
            System.out.println(clone3.getObject()==instance3.getObject());
            System.out.println("==========破坏枚举类型单例==========");
            SingletonRegistryEnum instance4 = SingletonRegistryEnum.getInstance();
            SingletonRegistryEnum registryEnum = ObjectCloneUtil.clone(instance4);
            System.out.println(instance4==registryEnum);
//            Class<?> aClass4 = Class.forName(SingletonRegistryEnum.class.getName());
//            Constructor<?> constructor4 = aClass4.getDeclaredConstructor(String.class,int.class);
//            constructor4.setAccessible(true);
//            SingletonRegistryEnum reflectObj4 =(SingletonRegistryEnum) constructor4.newInstance();
//            BreakTest.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test(){
        try {
            SingletonHolder instance1 = null;

            SingletonHolder instance2 = SingletonHolder.getInstanceByHolder();
            instance2.setObject(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (SingletonHolder) ois.readObject();
            ois.close();

            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1.getObject() == instance2.getObject());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
