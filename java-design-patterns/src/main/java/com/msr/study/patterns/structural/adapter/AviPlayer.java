package com.msr.study.patterns.structural.adapter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:36
 */

public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing mp4 file.Name:" + fileName);
    }

    public static void main(String[] args) {
        int num=50;
        num =num++*2;
        System.out.println(num);
    }
}
