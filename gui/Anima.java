package gui;
import javax.swing.*;
import java.awt.*;

public class Anima {
    int x = 70;
    int y = 70;
    public static void main(String [] args){
        Anima gui = new Anima();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawpanel = new MyDrawPanel();
        frame.getContentPane().add(drawpanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        for ( int i = 0; i<130; i++){
            x++;
            y++;
            drawpanel.repaint();
            try {
                Thread.sleep(50);
            } catch(Exception ex){}
        }
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x, y, 0, 0);
        }
    }
}
