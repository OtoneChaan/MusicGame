package main.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class MusicGameFrame extends JFrame {
    public MusicGameFrame() {
        // ウィンドウの設定
        setTitle("音楽ゲーム");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);

        // コンポーネントの配置
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("曲名");
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel gamePanel = new JPanel();
        mainPanel.add(gamePanel, BorderLayout.CENTER);

        JLabel scoreLabel = new JLabel("スコア: 0");
        mainPanel.add(scoreLabel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }
}
