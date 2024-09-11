package com.msr.study.patterns.behavioral.delegate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * leader委派者身份，分发工作
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 16:37
 */

public class Leader implements IExecutor {

    private Map<String, IExecutor> map = new ConcurrentHashMap<>();

    public Leader() {
        map.put(CommandEnum.JAVA.name(),new JavaEngineer());
        map.put(CommandEnum.FRONTEND.name(),new FrontendEngineer());
        map.put(CommandEnum.OPS.name(),new OpsEngineer());
    }

    @Override
    public void doJob(String command) {
        map.get(command).doJob(command);
    }


}
