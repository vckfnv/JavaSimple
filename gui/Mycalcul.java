package gui;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.*;
public class Mycalcul implements ActionListener{
	
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
    JTextField jfield = new JTextField(1);
	// constructor of mycalcul
	public Mycalcul(){
        
        //Container c = frame.getContentPane();
        panel.setLayout(new GridLayout(3,4));

        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9; 
        // create number buttons 
        
        b1 = new JButton("1"); 
        b2 = new JButton("2"); 
        b3 = new JButton("3"); 
        b4 = new JButton("4"); 
        b5 = new JButton("5"); 
        b6 = new JButton("6"); 
        b7 = new JButton("7"); 
        b8 = new JButton("8"); 
        b9 = new JButton("9");
        //add actionlistener
        b9.addActionListener(this); 
        b8.addActionListener(this); 
        b7.addActionListener(this); 
        b6.addActionListener(this); 
        b5.addActionListener(this); 
        b4.addActionListener(this); 
        b3.addActionListener(this); 
        b2.addActionListener(this); 
        b1.addActionListener(this);
        //add buttons to panel
        panel.add(b1); 
        panel.add(b2); 
        panel.add(b3);  
        panel.add(b4); 
        panel.add(b5); 
        panel.add(b6);  
        panel.add(b7); 
        panel.add(b8); 
        panel.add(b9);
        panel.add(jfield);
		// set size of frame
		frame.setSize(500, 500);
		
		//exit when click x button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add label
		frame.getContentPane().add(panel);
		//Center alignment of Label in the Frame
        //frame.setLayout(new FlowLayout());
        frame.setVisible(true);
	}
    //action performing to event
    public void actionPerformed(ActionEvent e) 
    { 
        //get button name
        String s = e.getActionCommand(); 
        //put String to jfield
        jfield.setText(s);}
        
    public static void main(String[] args)
	{
		//launcher
		new Mycalcul();
	}

}