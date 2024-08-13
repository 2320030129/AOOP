package com.example.musicstreaming;

public class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreamingPlayer streamingPlayer;
    private String url;

    public OnlineStreamingAdapter(String url) {
        this.streamingPlayer = new OnlineStreamingPlayer();
        this.url = url;
    }

    @Override
    public void play() {
        streamingPlayer.playStream(url);
    }
}
