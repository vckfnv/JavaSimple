public class Amphibian extends Animal{
    
    public Amphibian(){
        skin = "mucus";
        speices ="vertebrate";
        name = "Amphibian";
    }
    public void makenoise(){
        System.out.println(name+": I am Amphibian~ kuaaaa~");
    }
    public void breath(){
        System.out.println("Using both of my Lung, and my skin!");
    }
    
}