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
public class Fish extends Animal{
    
    private String waterTyper = "Sea";
   
    
    @Override
    public void move() {
        System.out.println("Riba pliva.");
    }

    @Override
    public void eat() {
        
        System.out.println("Riba jede morsku hranu ");
        
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Lives in: " + this.waterTyper);
        
    }
    
}
