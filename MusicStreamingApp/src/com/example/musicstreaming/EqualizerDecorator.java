package com.example.musicstreaming;

public class EqualizerDecorator extends MusicSourceDecorator {

    public EqualizerDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Applying equalizer settings.");
    }
}