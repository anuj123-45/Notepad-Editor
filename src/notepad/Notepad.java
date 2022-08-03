package notepad;

import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import javax.swing.text.StyleConstants;
import jdk.nashorn.internal.objects.NativeDebug;
import sun.security.x509.OIDMap;

/**
 *
 * @author Anuj
 */





public class Notepad {
   

    public static  void main(String[] args) {

       JFrame f= new JFrame("Notepad");
       
        f.setBounds(100, 100, 800, 600);

   
           
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem newfile = new JMenuItem("New");
        JMenuItem openfile = new JMenuItem("Open");
        JMenuItem savefile = new JMenuItem("Save");
        JMenuItem printfile = new JMenuItem("Print");
        JMenuItem exitfile = new JMenuItem("Exit");

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem selectall = new JMenuItem("Select All");

        JMenuItem about = new JMenuItem("About");

        file.add(newfile);

        file.add(openfile);
        file.add(savefile);
        file.add(printfile);
        file.add(exitfile);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);

        help.add(about);

       mb.add(file);
       mb.add(edit);
       mb.add(help);

        about.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameAction = new JFrame();
                 frameAction.setSize(500, 400);
                JLabel ln = new JLabel("<HTML>Welcome to Notepad<br>Notepad is a simple text editor for Microsoft Windows and a basic text-editing "
                        + " program which enables computer users to create document<br>All rights are reserved@2022</html>");
                  
                ln.setBounds(100,-50,300,300);
                
                frameAction.setTitle("About Section");
               
                frameAction.setLocationRelativeTo(null);
                frameAction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       frameAction.add(ln);
                       frameAction.setLayout(null);
            frameAction.setVisible(true);
            
                about.add(frameAction);
         
                

            }
        });

        f.setJMenuBar(mb);

        f.setVisible(true);

    }

}
