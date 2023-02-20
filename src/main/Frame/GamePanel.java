package main.Frame;

import main.InputHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GamePanel extends JPanel {
    private int noteSpeed;
    private int noteSize;
    private Color noteColor;
    private List<Note> notes = new ArrayList<>();
    private InputHandler inputHandler = new InputHandler();

    public GamePanel(int noteSpeed, int noteSize, Color noteColor) {
        this.noteSpeed = noteSpeed;
        this.noteSize = noteSize;
        this.noteColor = noteColor;
        setPreferredSize(new Dimension(640, 480));
        setFocusable(true);
        addKeyListener(inputHandler);
    }

    public void addNote() {
        int x = (int) (Math.random() * (getWidth() - noteSize));
        Note note = new Note(x, -noteSize, noteSize, noteSpeed, noteColor);
        notes.add(note);
    }

    public void removeNote() {
        Iterator<Note> iterator = notes.iterator();
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (note.isMissed()) {
                iterator.remove();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Note note : notes) {
            note.draw(g);
        }
    }

    public boolean isKeyDown(int keyCode) {
        return inputHandler.isKeyDown(keyCode);
    }
}
