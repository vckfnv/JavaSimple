package animal;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Savetback
 */
public class Savetback {

    public static void main(String[] args) {
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Frog.ser"));
            Frog rest1 = (Frog) is.readObject();
            Frog rest2 = (Frog) is.readObject();
            Frog rest3 = (Frog) is.readObject();
            
            System.out.println("One's type: " + rest1.getType());
            System.out.println("Two's type: " + rest2.getType());
            System.out.println("Three's type: " + rest3.getType());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}