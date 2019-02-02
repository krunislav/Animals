/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author qa-popodne
 */
public class Bird extends Animal{
    
    public String reproduction = "egg";
    public String outerCovering = "feather";

    @Override
    public void move() {
        System.out.println("Kreće se letenjem");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca.");
        
    }
    
    @Override
    public void info(){
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("Outer Covering" + this.outerCovering);
    }
}
