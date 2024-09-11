package com.msr.study.patterns.structural.adapter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:51
 */

public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3","非流行说唱.mp3");
        player.play("mp4","非流行说唱MV.mp4");
        player.play("avi","非流行说唱MV.avi");
    }
}
