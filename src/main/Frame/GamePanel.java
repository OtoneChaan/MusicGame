package main.Frame;

import main.Frame.Note;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class GamePanel extends JPanel {

    private ArrayList<Note> notes;
    private int score;

    public GamePanel() {
        notes = new ArrayList<>();
        score = 0;
        setBackground(Color.WHITE);
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void removeNote(Note note) {
        notes.remove(note);
    }

    public void update() {
        Iterator<Note> it = notes.iterator();
        while (it.hasNext()) {
            Note note = it.next();
            note.move();
            if (note.getY() > getHeight()) {
                it.remove();
                score++;
            }
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Note note : notes) {
            note.draw(g);
        }
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
    }

}
