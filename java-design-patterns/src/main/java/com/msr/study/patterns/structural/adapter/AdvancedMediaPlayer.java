package com.msr.study.patterns.structural.adapter;

/**
 * 高级多媒体播放器
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:33
 */

public interface AdvancedMediaPlayer {

    /**
     * 播放mp4
     *
     * @param fileName 文件名称
     */
    void playMp4(String fileName);

    /**
     * 播放avi
     *
     * @param fileName 文件名称
     */
    void playAvi(String fileName);
}
