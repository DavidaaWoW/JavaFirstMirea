package ru.mirea.hospital;

import javax.swing.*;
import java.awt.*;

enum Doctors{
    Dentist, Therapist, Otolaryngologist, Endocrinologist, Optometrist
}

public class Client extends JFrame {
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JLabel label = new JLabel();
    public Client(){
        setSize(1080,720);
        setLocationRelativeTo(null);
        Doctors d1,d2,d3,d4,d5;
        d1 = Doctors.Dentist;
        d2 = Doctors.Therapist;
        d3 = Doctors.Otolaryngologist;
        d4 = Doctors.Endocrinologist;
        d5 = Doctors.Optometrist;
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
        gbl.setConstraints(label,c);
        add(label);
        gbl.setConstraints(button1,c);
        add(button1);
        gbl.setConstraints(button2,c);
        add(button2);
        gbl.setConstraints(button3,c);
        add(button3);
        gbl.setConstraints(button4,c);
        add(button4);
        gbl.setConstraints(button5,c);
        add(button5);
        button1.setPreferredSize(new Dimension(300,80));
        button2.setPreferredSize(new Dimension(300,80));
        button3.setPreferredSize(new Dimension(300,80));
        button4.setPreferredSize(new Dimension(300,80));
        button5.setPreferredSize(new Dimension(300,80));
        Font f = new Font("Sans Serif", Font.BOLD, 20);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);
        button4.setFont(f);
        button5.setFont(f);
        button1.setText(Doctors.Dentist.toString());
        button2.setText(Doctors.Therapist.toString());
        button3.setText(Doctors.Otolaryngologist.toString());
        button4.setText(Doctors.Endocrinologist.toString());
        button5.setText(Doctors.Optometrist.toString());
        label.setText("Please, choose the doctor");
        label.setFont(f);
    }
    private void doctorSave(Doctors doctors){
        
    }
}
