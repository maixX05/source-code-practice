package com.msr.study.patterns.structural.adapter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:36
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:"+fileName);
    }

    @Override
    public void playAvi(String fileName) {

    }
}
