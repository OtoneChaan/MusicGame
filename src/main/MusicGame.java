package main;

import main.Frame.GamePanel;

import javax.swing.*;
import java.awt.*;

public class MusicGame extends JFrame {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int NOTE_SPEED = 5;
    private static final int NOTE_SIZE = 50;
    private static final Color NOTE_COLOR = Color.BLUE;

    private GamePanel gamePanel;

    public MusicGame() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        gamePanel = new GamePanel(NOTE_SPEED, NOTE_SIZE, NOTE_COLOR);
        add(gamePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MusicGame();
    }

    public int getHeight(){
        return HEIGHT;
    }
}
