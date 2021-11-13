package ru.mirea.hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App extends JFrame {
    private JButton client = new JButton();
    private JButton stuff = new JButton();
    public App(){
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
        gbl.setConstraints(client,c);
        add(client);
        gbl.setConstraints(stuff,c);
        add(stuff);
        client.setPreferredSize(new Dimension(300,100));
        stuff.setPreferredSize(new Dimension(300,100));
        Font f = new Font("Sans Serif", Font.BOLD, 20);
        client.setFont(f);
        stuff.setFont(f);
        client.setText("I am client");
        stuff.setText("I am doctor");
        client.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Client client = new Client();
                client.setVisible(true);
                client.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                Window frame = SwingUtilities.windowForComponent((Component) e.getSource());
                frame.setVisible(false);
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
        stuff.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Stuff stuff = new Stuff();
                stuff.setVisible(true);
                stuff.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                Window frame = SwingUtilities.windowForComponent((Component) e.getSource());
                frame.setVisible(false);
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

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
