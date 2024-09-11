package com.msr.study.patterns.structural.proxy.dbrouter.datasource;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:39
 */

public class DynamicDataSource {

    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSource() {
    }

    public static String get() {
        return local.get();
    }

    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }
}
