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
public class Eagle extends Bird{
    
    private String name = "Orao";
    private int lifespan = 15;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Naziv ptice je:" + this.name);
        System.out.println("Životni vek je:" + this.lifespan);
    }
}
