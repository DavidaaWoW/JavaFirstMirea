package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrameApp extends JFrame {
    private JButton first = new JButton("AC Milan");
    private JButton second = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel lastScorer = new JLabel("Last scorer: N/A");
    private JLabel winner = new JLabel("Winner: Draw");
    private Font f = new Font("Sans Serif", Font.BOLD, 20);
    private int firstTeamScore = 0;
    private int secondTeamScore = 0;

    public MainFrameApp(){
        setSize(500,300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,2,2,2));
        add(first);
        add(second);
        add(result);
        add(lastScorer);
        add(winner);
        result.setFont(f);
        lastScorer.setFont(f);
        winner.setFont(f);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        lastScorer.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        first.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                firstTeamScore++;
                result.setText(getScore());
                lastScorer.setText("Last scorer: AC Milan");
                winner.setText(getWinner());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        second.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                secondTeamScore++;
                result.setText(getScore());
                lastScorer.setText("Last scorer: Real Madrid");
                winner.setText(getWinner());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private String getWinner(){
        return "Winner: " + (firstTeamScore > secondTeamScore ? "AC Milan" : firstTeamScore < secondTeamScore ? "Real Madrid" : "Draw");
    }

    private String getScore(){
        return "Result: " + firstTeamScore + " X " + secondTeamScore;
    }

    public static void main(String[]args)
    {
        MainFrameApp main = new MainFrameApp();
        main.setVisible(true);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
