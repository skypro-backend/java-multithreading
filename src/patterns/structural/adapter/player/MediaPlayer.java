package patterns.structural.adapter.player;

// Целевой интерфейс, который ожидается клиентом
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
