package gui;
import javax.swing.*;
public class Guii {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Hello");
            // Jbutton
        JButton button = new JButton();

// Buffered Icon
        BufferedImage buttonIcon = null;

        try {
    // Get the image and set it to the imageicon
            buttonIcon = ImageIO.read(getClass().getClassLoader().getResource("images/login.png"));
        }
        catch(Exception ex) {

        }

// Set the image icon here
        button = new JButton(new ImageIcon(buttonIcon));
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }
}