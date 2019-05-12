package animal;
import java.io.Serializable;
public class Frog extends Amphibian implements Pet, Serializable{
    //int lifespan = 10;
    public Frog(){
        lifespan =10;
        name="Frog";
    }
    public void makenoise(){
        System.out.println("Frog: croak!");
    }
    public void play(){
        System.out.println("croak!! croak!!(This frog looks happy to playing)");
    }
    public void isCute(){
        System.out.println("this one is sooooo cute!!");
    }
    
}