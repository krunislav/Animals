import animals.Bird;
import animals.Fish;
import animals.Eagle;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bird myBird = new Bird();
        
        myBird.info();
        myBird.move();
        myBird.eat();
        
        Eagle eagle = new Eagle();
        eagle.info();
        eagle.move();
        eagle.eat();
        
        Fish myFish = new Fish();
        myFish.move();
        myFish.info();
        myFish.eat();
        
    }
    
}
