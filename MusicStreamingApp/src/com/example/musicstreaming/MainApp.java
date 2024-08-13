package com.example.musicstreaming;

public class MainApp {
    public static void main(String[] args) {
        // Playing a local file with equalizer and volume control
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource localFileWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localFile));
        localFileWithFeatures.play();

        System.out.println();

        // Streaming online music with equalizer
        MusicSource onlineStream = new OnlineStreamingAdapter("http://streaming-service.com/song");
        MusicSource onlineStreamWithEqualizer = new EqualizerDecorator(onlineStream);
        onlineStreamWithEqualizer.play();

        System.out.println();

        // Playing a radio station with volume control
        MusicSource radioStation = new RadioStationAdapter("Jazz FM");
        MusicSource radioStationWithVolumeControl = new VolumeControlDecorator(radioStation);
        radioStationWithVolumeControl.play();
    }
}
