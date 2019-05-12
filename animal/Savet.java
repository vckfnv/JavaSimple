package animal;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.Serializable;
/**
 * Savetest
 */
public class Savet implements Serializable{

    
    public static void main(String[] args){ 
        Frog one = new Frog();
        Frog two = new Frog();
        Frog three = new Frog();   
        try {
            
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Frog.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);

            os.close();
                
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }
    
}