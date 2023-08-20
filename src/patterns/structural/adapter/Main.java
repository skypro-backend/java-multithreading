package patterns.structural.adapter;

import patterns.structural.adapter.player.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = null;

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}
