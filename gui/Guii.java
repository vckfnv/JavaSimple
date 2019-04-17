package gui;
import javax.swing.*;
public class Guii {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Hello");
        JButton button = new JButton("click Hello world");
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }
}