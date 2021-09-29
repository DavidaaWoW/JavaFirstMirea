package ru.mirea.task11.second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main extends JFrame {
    JPanel NORTH = new JPanel();
    JPanel SOUTH = new JPanel();
    JPanel EAST = new JPanel();
    JPanel WEST = new JPanel();
    JPanel CENTER = new JPanel();
    Color color;
    Random random = new Random();

    public Main(){
        setSize(new Dimension(1000,1000));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        NORTH.setBackground(color);
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        SOUTH.setBackground(color);
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        EAST.setBackground(color);
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        WEST.setBackground(color);
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        CENTER.setBackground(color);
        NORTH.setPreferredSize(new Dimension(0,250));
        SOUTH.setPreferredSize(new Dimension(0,250));
        EAST.setPreferredSize(new Dimension(250,0));
        WEST.setPreferredSize(new Dimension(250,0));

        add(NORTH,BorderLayout.NORTH);
        add(SOUTH,BorderLayout.SOUTH);
        add(EAST,BorderLayout.EAST);
        add(WEST, BorderLayout.WEST);
        add(CENTER, BorderLayout.CENTER);
        NORTH.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null,"You've entered NORTH zone");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        SOUTH.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null,"You've entered SOUTH zone");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        WEST.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null,"You've entered WEST zone");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        EAST.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null,"You've entered EAST zone");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        CENTER.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null,"You've entered CENTER zone");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
