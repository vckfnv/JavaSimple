package chatt;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class Cient{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Today you should: "+ advice);
            reader.close();
            System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}