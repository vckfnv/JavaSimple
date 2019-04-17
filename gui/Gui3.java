package gui;
import java.awt.event.*;
public class Gui3 extends JFrame implements ActionListener{
    //private static String labelPrefix = "Num of button clicks : ";
    private int click = 0;
    JLabel label = new JLabel("Num of button clicks : "+ "0     ");
    public Gui3 (String title){
        super(title);
        JButton button = new JButton("Swing button!");
        
        //add action listener!
        button.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        pack();
        setVisible(true);

    }
    //implement actionperform!
    public void actionPerformed(ActionEvent event) {
        label.setText("Num of button clicks : "+ ++click);
    }
    public static void main(String[] args){
        new Gui3("SwingApp");
    }
}
