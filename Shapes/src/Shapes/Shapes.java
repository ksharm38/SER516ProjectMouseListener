/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;
import javax.swing.*;


/**
 *
 * @author kunnu
 */
public class Shapes {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Test");
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw objDraw =new Draw();
        frame.add(objDraw);
        objDraw.drawing();
    }
    
}
