package com.example.audi_player;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;

    public int getCurrentPosition() {
        return 0;
    }

    public boolean isPlaying() {
        return false;
    }

    public void seekTo(int progress) {
            return;
    }

    public void reset() {

    }

    public void pause() {
    }

    public void start() {
    }

    public int getDuration() {
        return 0;
    }

    public void setDataSource(String path) {

    }

    public void prepare() {

    }
}
