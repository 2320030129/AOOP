package com.example.musicstreaming;

public class VolumeControlDecorator extends MusicSourceDecorator {

    public VolumeControlDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Adjusting volume.");
    }
}
