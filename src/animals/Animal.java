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
public abstract class Animal {
    
    public abstract void move();
    
    public abstract void eat();
    
    public void info(){
        System.out.println("Podaci o zivotinji: ");
    }
}
