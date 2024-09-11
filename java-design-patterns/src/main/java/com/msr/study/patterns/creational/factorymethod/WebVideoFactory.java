package com.msr.study.patterns.creational.factorymethod;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 15:48
 * @version: v1.0
 */

public class WebVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new WebVideo();
    }

    @Override
    public Article getArticle() {
        return null;
    }
}
