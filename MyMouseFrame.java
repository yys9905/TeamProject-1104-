import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Write a description of class MyFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseFrame extends JFrame
{
    JLabel ml;
    MyMouseFrame(){
        super("MouseListener & MouseMotionListener");
        JPanel mp = new JPanel();
        
        ml = new JLabel("No Mouse Event");
        mp.add(ml);
        
        MyMouseListener ml = new MyMouseListener();
        
        mp.addMouseListener(ml);
        mp.addMouseMotionListener(ml);
    }
}
