package ru.mirea.hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Feedback extends JFrame {
    private JTextArea textArea = new JTextArea();
    private JLabel label = new JLabel();
    private JButton button = new JButton();
    private List <String> feedback = new ArrayList<String>();
    public Feedback(){
        setSize(1080,720);
        setLocationRelativeTo(null);
        GridBagConstraints c =  new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.REMAINDER;
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridy = GridBagConstraints.RELATIVE;
        c.insets = new Insets(40, 0, 0, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;
        textArea.setPreferredSize(new Dimension(300,100));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        button.setPreferredSize(new Dimension(200,50));
        label.setText("Please give us feedback about your visit");
        button.setText("SUBMIT");
        gbl.setConstraints(label, c);
        add(label);
        gbl.setConstraints(textArea, c);
        add(textArea);
        gbl.setConstraints(button, c);
        add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                feedback.add(textArea.getText());
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
}
