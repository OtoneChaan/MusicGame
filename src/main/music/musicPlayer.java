package music;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class musicPlayer {
    private Player player;

    public void play(String filename) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(bis);
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        player.close();
    }
}
