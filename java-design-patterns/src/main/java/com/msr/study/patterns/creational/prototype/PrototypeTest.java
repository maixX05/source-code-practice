package com.msr.study.patterns.creational.prototype;

import com.msr.study.patterns.creational.singleton.ObjectCloneUtil;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 15:58
 * @version: v1.0
 */

public class PrototypeTest {

    public static void main(String[] args) {
        SimpleClone simpleClone = new SimpleClone();
        simpleClone.setName("msr");
        simpleClone.setObj(new Person("15"));
        try {
            SimpleClone clone = simpleClone.clone();
            //浅克隆
            System.out.println(clone.getObj()==simpleClone.getObj());
            //通过反序列化深度克隆
            DeepClone deepClone = new DeepClone("zhangsan", new Person("16"));
            DeepClone deep = ObjectCloneUtil.clone(deepClone);
            System.out.println(deep.getObj()==deepClone.getObj());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
