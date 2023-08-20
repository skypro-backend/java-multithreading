package patterns.structural.adapter.player;

import patterns.structural.adapter.not_adapted.AdvancedMediaPlayer;

public class AdaptedMediaPlayer implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
