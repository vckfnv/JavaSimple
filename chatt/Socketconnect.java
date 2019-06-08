package chatt;

//package chatt;

import java.net.Socket;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Socketconnect {
    public void go(PrintWriter inwriter){
        JFrame frame = new JFrame("myframe");
        JButton btn = new JButton("Send");
        JPanel panel = new JPanel();
        JTextField outgoing = new JTextField("");
    
        panel.add(outgoing);
        panel.add(btn);
        frame.getContentPane().add(panel);
        frame.setSize(300, 500);
		//exit when click x button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
       
        btn.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try{
                    inwriter.println(outgoing.getText());
                    inwriter.flush();
                } catch (Exception ex){ex.printStackTrace();}
            }
        });
    }
    
    public static void main(String[] args) {
        Socketconnect conn = new Socketconnect();

        try{
            Socket sock = new Socket("127.0.0.1", 5000);
            System.out.println(sock);
            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
            conn.go(writer);
        } catch (IOException ex){ex.printStackTrace();}
        
    }
}