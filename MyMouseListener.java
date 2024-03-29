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
    JLabel ml;
    public MyMouseListener(JLabel label){
        ml = label;       
    }    
    public void mouseEntered(MouseEvent e){
        JPanel mp = (JPanel) e.getSource();    
        mp.setBackground(Color.CYAN);
    }

    public void mousePressed(MouseEvent e){
        ml.setText("MousePressed("+e.getX()+","+e.getY()+")");
    }

    public void mouseReleased(MouseEvent e){
        ml.setText("MouseReleased("+e.getX()+","+e.getY()+")");
    }

    public void mouseClicked(MouseEvent e){}

    public void mouseExited(MouseEvent e){
        JPanel mp = (JPanel) e.getSource();    
        mp.setBackground(Color.YELLOW);
    }

    public void mouseDragged(MouseEvent e){
        ml.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e){
        ml.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");  
    }

}
    