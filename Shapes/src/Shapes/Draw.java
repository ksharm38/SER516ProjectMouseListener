/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author kunnu
 */
public class Draw extends JPanel {
    
    public void drawing()
    {
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        int[] x=new int[]{400,500,600};
        int [] y = new int[]{20,150,20};
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(10, 15, 100, 100);
        
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.blue);
        g.fillPolygon(x,y,3);
    }
    
}
