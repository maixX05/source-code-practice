package com.msr.study.patterns.structural.adapter;

/**
 * 多媒体播放器
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 11:32
 */
public interface MediaPlayer {
    /**
     * 播放功能
     *
     * @param audioType 媒体类型
     * @param fileName  文件名称
     */
    void play(String audioType, String fileName);
}
