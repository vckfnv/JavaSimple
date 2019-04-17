package gui;
import javax.swing.*;
import java.awt.event.*;

public class Gui2 implements ActionListener{
    //private static String labelPrefix = "Num of button clicks : ";
    private int click = 0;
    JLabel label = new JLabel("Num of button clicks : "+ "0     ");
    public void go ( String title){
        JFrame frame = new JFrame(title);
        JButton button = new JButton("Swing button!");
        
        //add action listener!
        button.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    //implement actionperform!
    public void actionPerformed(ActionEvent event) {
        label.setText("Num of button clicks : "+ ++click);
    }
    public static void main(String[] args){
        Gui2 button = new Gui2();
        button.go("Event handling");
    }
}