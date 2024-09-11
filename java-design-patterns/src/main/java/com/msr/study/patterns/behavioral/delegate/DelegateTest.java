package com.msr.study.patterns.behavioral.delegate;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 16:37
 */

public class DelegateTest {

    public static void main(String[] args) {
        //看上去好像都是leader在工作，其实是leader委派给了其他人去工作
        Leader leader = new Leader();
        leader.doJob(CommandEnum.JAVA.name());
        leader.doJob(CommandEnum.OPS.name());
    }
}
