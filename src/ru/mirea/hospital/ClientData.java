package ru.mirea.hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class ClientData extends JFrame {
    private JLabel label = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JTextArea textArea = new JTextArea();
    private JTextArea textArea2 = new JTextArea();
    private JTextArea textArea3 = new JTextArea();
    JButton button = new JButton();
    public ClientData(Doctors doctors){
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
        Font f = new Font("Sans Serif", Font.BOLD, 20);
        gbl.setConstraints(label, c);
        add(label);
        String header = "You make an appointment with a " + doctors.toString();
        label.setText(header);
        label.setFont(f);
        label2.setFont(f);
        label3.setFont(f);
        label4.setFont(f);
        textArea.setPreferredSize(new Dimension(300,25));
        textArea2.setPreferredSize(new Dimension(50,25));
        textArea3.setPreferredSize(new Dimension(300,25));
        textArea.setFont(f);
        textArea2.setFont(f);
        textArea3.setFont(f);
        button.setFont(f);
        gbl.setConstraints(label2, c);
        add(label2);
        gbl.setConstraints(textArea, c);
        add(textArea);
        gbl.setConstraints(label3, c);
        add(label3);
        gbl.setConstraints(textArea2, c);
        add(textArea2);
        gbl.setConstraints(label4, c);
        add(label4);
        gbl.setConstraints(textArea3, c);
        add(textArea3);
        label2.setText("Enter your name and surname");
        label3.setText("Enter your age");
        label4.setText("Enter additional comments");
        button.setPreferredSize(new Dimension(200,50));
        button.setText("Submit");
        gbl.setConstraints(button, c);
        add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    int k = Integer.parseInt(textArea2.getText());
                }
                catch (Exception exception){
                    showMessageDialog(null, "Enter your real age!");
                }
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
