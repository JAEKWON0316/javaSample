package web06.plugin;

import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.*;
import java.applet.*;

public class PluginApplet extends JApplet{
   JMenuBar bar;
   JMenu file, edit;
   JMenuItem fileNew, fileOpen, fileSave;
   JTextArea text;
   
    public void init() {
       bar = new JMenuBar();
       file = new JMenu("File");
       edit = new JMenu("Edit");
       bar.add(file);
       bar.add(edit);
       
       fileNew = new JMenuItem("New");
       fileOpen = new JMenuItem("Open");
       fileSave = new JMenuItem("Save");
       
       file.add(fileNew);
       file.add(fileOpen);
       file.add(fileSave);
       
       setJMenuBar(bar);
       String data = getParameter("data");
       
       text = new JTextArea(data);
       JScrollPane sp = new JScrollPane(text);
       
       getContentPane().setLayout(new BorderLayout());
       getContentPane().add(sp, "center");
       
    }
}