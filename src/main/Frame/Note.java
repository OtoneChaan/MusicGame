package main.Frame;

import main.MusicGame;

import java.awt.*;

public class Note {
    private int x;
    private int y;
    private int size;
    private int speed;
    private Color color;
    private boolean missed = false;

    private MusicGame mg;

    public Note(int x, int y, int size, int speed, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.color = color;
    }

    public void move() {
        y += speed;
        if (y > mg.getHeight()) {
            missed = true;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }

    public boolean isPressed(int keyX, int keyY, int keySize) {
        return x + size > keyX && x < keyX + keySize && y + size > keyY;
    }

    public boolean isMissed() {
        return missed;
    }
}
