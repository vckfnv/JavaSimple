package gui;
import javax.swing.*;
public class HelloworldGui {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Hello");
        final JLabel label = new JLabel("Hello world");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
}