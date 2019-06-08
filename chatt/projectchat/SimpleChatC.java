import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.lang.Thread;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * SimpleChat
 */


public class SimpleChatC {

    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        new SimpleChatC().go();
        System.out.println("display!");
    }
    
    public SimpleChatC(){
        JFrame frame = new JFrame("Simple chat client");
        JPanel panel = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writer.println(outgoing.getText());
                    writer.flush();
                    
                } catch (Exception ex) { 
                    ex.printStackTrace();
                }
                outgoing.setText("");
                outgoing.requestFocus();
            }
        });
        outgoing.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writer.println(outgoing.getText());
                    writer.flush();
                    
                } catch (Exception ex) { 
                    ex.printStackTrace();
                }
                outgoing.setText("");
                outgoing.requestFocus();
            
            }
        });
        panel.add(scroller);
        panel.add(outgoing);
        panel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(650,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void go(){
        setUpNetworking();
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }

    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader (streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        }catch(IOException ex) { ex.printStackTrace();}
    }

    //public class SendButtonListener implements ActionListener{}
    class IncomingReader implements Runnable{
        public void run() {
            String message;
            try{
                while ((message = reader.readLine()) !=null){
                    System.out.println("client read" + message);
                    incoming.append(message + "\n");
                }
            }catch (IOException ex) {ex.printStackTrace();}
        }
    }


    
}