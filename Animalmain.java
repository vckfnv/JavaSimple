public class Animalmain {
    public static void main(String[] args) {
        
        Animal[] anims = new Animal[2];
        anims[0]= new Amphibian();
        anims[1]= new Frog();
        for (int i=0;i<anims.length;i++){
            anims[i].makenoise();
            if (anims[i] instanceof Frog){
                System.out.println(anims[i].lifespan);
                ((Frog)anims[i]).play();
                ((Frog)anims[i]).isCute();
            }else {
                System.out.println("Every animals has its own lifespan,\nthey are all different.");
            }
            System.out.println();
        }
        Robot robofrogy = new RobotFrog();
        System.out.println(robofrogy.name);
        ((RobotFrog)robofrogy).walk();
        ((RobotFrog)robofrogy).play();
        ((RobotFrog)robofrogy).isCute();
        
    }
}