import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * 레이블과 마우스리스너 마우스모션리스너를 포함하고 있는 
 * 패널을 만들어 프레임에 넣어주는 클래스
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.11.04)
 */
public class MyMouseFrame extends JFrame
{
    JLabel ml;
    MyMouseFrame(){
        super("MouseListener & MouseMotionListener");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mp = new JPanel();
        
        ml = new JLabel("No Mouse Event");
        mp.add(ml);
        
        MyMouseListener ml = new MyMouseListener();
        
        mp.addMouseListener(ml);
        mp.addMouseMotionListener(ml);
        this.setVisible(true);
    }
}
