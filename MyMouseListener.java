import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener extends MouseMotionAdapter implements MouseListener
{
    public void mouseEntened(MouseEvent e){
        e.getSource().setBackground(Color.CYAN);
    }
    
    public void mousePressed(MouseEvent e){
        ml.getSource("MousePressed("+e.getX()+","+e.getY()+")");
    }
    
    public void mouseReleased(MouseEvent e){
        ml.getSource("MouseReleased("+e.getX()+","+e.getY()+")");
    }
    
    public void mouseClicked(MouseEvent e){
        ml.getSource("MouseClicked("+e.getX()+","+e.getY()+")");
    }
    
    public void mouseExited(MouseEvent e){
        e.getSource().setBackground(Color.YELLOW);
    }
}
