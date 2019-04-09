package ldhjava;
public abstract class Animal {
 
    int lifespan;
    String speices;
    String skin;
    String food;
    String name;
    
    public void eat(){
        System.out.println("yummy~");
    }
    public void sleep(){
        System.out.println("zzz...this animal is sleeping...");
    }
    public abstract void makenoise();
    
    public void setFood(String food){
        this.food=food;
    }
    public String getFood(){
        return food;
    }
}