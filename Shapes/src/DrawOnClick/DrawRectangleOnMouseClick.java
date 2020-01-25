/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawOnClick;

import java.awt.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;

public class DrawRectangleOnMouseClick extends JPanel{

     MouseHandler mouseHandler = new MouseHandler();
     Point p1 = new Point(0, 0);
     Point p2 = new Point(0, 0);
     boolean drawing;
     Graphics g1;

    public DrawRectangleOnMouseClick(){
        this.setPreferredSize(new Dimension(500, 400));
        this.addMouseListener(mouseHandler);
    }

    protected void paintComponent(Graphics g) {
       
        super.paintComponent(g);
        g.drawRect(p1.x, p1.y, p2.x, p2.y);
    }

    private class MouseHandler extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            drawing = true;
            p1 = e.getPoint();
            p2 = p1;
           repaint();
        }

        public void mouseReleased(MouseEvent e) {
           // drawing = false;
           // p2 = e.getPoint();
           // repaint();
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Rectangle On Mouse Click");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new DrawRectangleOnMouseClick());
        f.pack();
        f.setVisible(true);
    }
}