package animal;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.Serializable;
/**
 * Savetest
 */
public class Savetest implements Serializable{

    
    transient private Salamander sal = new Salamander();
    private Salamander sala = new Salamander();
    public static void main(String[] args){ 
        Savetest st = new Savetest();   
        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(st);
            os.close();
                
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
}