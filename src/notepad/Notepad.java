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
import java.util.Locale;
import javax.swing.text.StyleConstants;
import jdk.nashorn.internal.objects.NativeDebug;
import sun.security.x509.OIDMap;

/**
 *
 * @author Anuj
 */





public class Notepad {
   

    public static  void main(String[] args) {

        
        // Main frame
       JFrame f= new JFrame("Notepad");
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       // title bar image
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anuj\\Documents\\NetBeansProjects\\Notepad\\src\\notepad\\image.jpg");    
         f.setIconImage(icon); 
        f.setBounds(100, 100, 800, 600);
       
        // for text area
        
        JTextArea t=new JTextArea();
        t.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
   
           // for menu bar
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        // for file menu
        JMenuItem newfile = new JMenuItem("New");
        JMenuItem openfile = new JMenuItem("Open");
        JMenuItem savefile = new JMenuItem("Save");
        JMenuItem printfile = new JMenuItem("Print");
        JMenuItem exitfile = new JMenuItem("Exit");

        // for edit menu
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem selectall = new JMenuItem("Select All");

        // for about menu
        JMenuItem about = new JMenuItem("About");

        // for adding menu items in file
        file.add(newfile);
        file.add(openfile);
        file.add(savefile);
        file.add(printfile);
        file.add(exitfile);

        // for adding menu items in edit
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);

        // for adding menu items in about
        help.add(about);

        // adding menus in menubar
       mb.add(file);
       mb.add(edit);
       mb.add(help);

       // when click on about (menuitem)
        about.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                JFrame frameAction = new JFrame();

                 frameAction.setSize(500, 400);
                JLabel ln = new JLabel("<HTML>We"
                        + "welcome to Notepad<br>Notepad is a simple text editor for Microsoft Windows and a basic text-editing "
                        + " program which enables computer users to create document<br>All rights are reserved@2022</html>");
                  
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anuj\\Documents\\NetBeansProjects\\Notepad\\src\\notepad\\image.jpg");    
        frameAction.setIconImage(icon); 
                
                ln.setBounds(100,-50,300,300);
                
                frameAction.setTitle("About Section");
                frameAction.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameAction.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
               
                frameAction.setLocationRelativeTo(null);

                       frameAction.add(ln);
                       frameAction.setLayout(null);
            frameAction.setVisible(true);
            
                about.add(frameAction);
                }
         
                catch(Exception exp){
                System.out.println(exp);
                }

            }
        });


        // adding  menubar in main frame
        f.setJMenuBar(mb);
      // for adding scroll bar when text reaches the max size of window
        JScrollPane jp=new JScrollPane(t);
        f.add(jp);
        // for making horizontal bar hide
        jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // for making vertical bar visible
        jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        t.setLineWrap(true);
        t.setWrapStyleWord(true);
  
        // for making frame visible
        f.setVisible(true);

    }

}
