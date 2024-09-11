package com.msr.study.patterns.creational.simplefactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 14:51
 * @version: v1.0
 */

public class VideoFactory {

    public Video getVideoV2(Class<?> clazz){
        Video video = null;
        try {
            video = (Video) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type){
        if ("java".equals(type)){
            return new JavaVideo();
        }else if ("python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

}
