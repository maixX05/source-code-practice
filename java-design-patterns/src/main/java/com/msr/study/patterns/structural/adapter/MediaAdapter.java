package com.msr.study.patterns.structural.adapter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:39
 */

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("avi") ){
            advancedMusicPlayer = new AviPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("avi".equalsIgnoreCase(audioType)) {
            this.advancedMusicPlayer.playAvi(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            this.advancedMusicPlayer.playMp4(fileName);
        }
    }
}
