package ru.mirea.hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static javax.swing.JOptionPane.showMessageDialog;


public class TimeSelect extends JFrame {
    private  final  String  DATETIME_format = "yyyy-MM-dd HH:mm:ss";
    private  final  String MINUTES_format = "mm";
    DateFormat date = new SimpleDateFormat(DATETIME_format);
    Date datee = new Date();

    private JButton button = new JButton();
    File file = new File("C:\\Users\\User\\Desktop\\учёба\\2курс\\жаба\\JavaFirstMirea\\src\\ru\\mirea\\hospital\\dentistq.txt");
    File file2 = new File("C:\\Users\\User\\Desktop\\учёба\\2курс\\жаба\\JavaFirstMirea\\src\\ru\\mirea\\hospital\\therapistq.txt");
    File file3 = new File("C:\\Users\\User\\Desktop\\учёба\\2курс\\жаба\\JavaFirstMirea\\src\\ru\\mirea\\hospital\\otolaryngologistq.txt");
    File file4 = new File("C:\\Users\\User\\Desktop\\учёба\\2курс\\жаба\\JavaFirstMirea\\src\\ru\\mirea\\hospital\\endocrinologistq.txt");
    File file5 = new File("C:\\Users\\User\\Desktop\\учёба\\2курс\\жаба\\JavaFirstMirea\\src\\ru\\mirea\\hospital\\optometristq.txt");
    File curr_file;

    public TimeSelect(Doctors doctors, String name){
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
        button.setText("Click to join the queue");
        button.setPreferredSize(new Dimension(400,100));
        gbl.setConstraints(button, c);
        add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String last;
                switch (doctors){
                    case Dentist:
                        curr_file = file;
                        break;
                    case Therapist:
                        curr_file = file2;
                        break;
                    case Otolaryngologist:
                        curr_file = file3;
                        break;
                    case Endocrinologist:
                        curr_file = file4;
                        break;
                    case Optometrist:
                        curr_file = file5;
                        break;
                    default:
                        last = "";
                        break;
                }
                last = readFile(curr_file);
                String result = name + "/";
                String curr_date = "";
                if(last.equals("")){
                    result += date.format(datee);
                    curr_date = date.format(datee);
                }
                else {
                    boolean check = false;
                    for(int a = 0; a< last.length(); a++){
                        if(last.charAt(a) == '/'){
                            check = true;
                            continue;
                        }
                        if(check){
                            curr_date+=last.charAt(a);
                        }
                    }
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATETIME_format);
                    LocalDateTime parsedTime = LocalDateTime.parse(curr_date, dateTimeFormatter);
                    LocalDateTime parsedTimePlus = parsedTime.plusMinutes(30);
                    result += parsedTimePlus.format(dateTimeFormatter);
                }
                writeToFile(curr_file, result);
                showMessageDialog(null, "You have an appointment with a doctor on " + curr_date);
                Feedback feedback = new Feedback();
                feedback.setVisible(true);
                feedback.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

    String readFile(File filee){
        String result = "";
        try(FileReader reader = new FileReader(filee)){
            BufferedReader buf = new BufferedReader(reader);
            String str = "";
            str = buf.readLine();
            if(str.equals(""))
                return str;
            while (!str.equals("")){
                result = str;
                System.out.println(str);
                str = buf.readLine();
            }
            return result;
        }
        catch (Exception io){
            return result;
        }
    }

    void writeToFile(File filee, String queue){
        try(FileWriter writer = new FileWriter(filee, true)){
            writer.write(queue);
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
