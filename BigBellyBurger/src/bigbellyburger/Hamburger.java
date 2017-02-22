/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburger;

import java.util.ArrayList;

/**
 *
 * @author Raziel 2
 */
public class Hamburger {
    private String breadType;
    private String meatType;
    private double price;
    private ArrayList<Ingredient> additions = new ArrayList<Ingredient>();
    protected int limAdditions;

    public Hamburger(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.limAdditions = 4;
    }   
    
    public boolean setAddition(Ingredient addition){
        if (this.additions.size()< this.limAdditions){
            return additions.add(addition);
        } else {
            System.out.print("Limit exceeded");
            return false;
        }    
    }
    public boolean setAdditions(String name, double price){
        if(this.additions.size()< this.limAdditions){
            return additions.add(new Ingredient(name,price));
        }else{
            System.out.println("Limit exceeded");
            return false;
        } 
    }
    public void getTotal(){
        double total = 0;
        System.out.println("This is a trditional" + this.meatType + "Burger = " + 
                "in " + this.breadType + "with a base price of " + this.price);
        
        total += this.price;
        
        for (Ingredient tempIngredient: this.additions){
            System.out.println("plus " + tempIngredient.getName() + " at " + 
                    tempIngredient.getPrice());
            total += tempIngredient.getPrice();
        }
        System.out.println("With a grand total of " + total);
    }
}

