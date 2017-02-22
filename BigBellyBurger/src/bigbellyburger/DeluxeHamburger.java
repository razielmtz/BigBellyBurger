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
public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger(String breadType, String meatType, double price) {
        super(breadType, meatType, price);
        limAdditions = 2;
        this.setAdditions("fries",0.5);
        this.setAdditions("soda",1.0);
    }
    public DeluxeHamburger(String breadType, String meatType, double price, String name1, double price1, String name2,
    double price2) {
        super(breadType, meatType, price);
        limAdditions = 2;
        this.setAdditions(name1,price1);
        this.setAdditions(name2,price2);
    }
    
    @Override 
    public void getTotal(){
        System.out.println("This is a deluxe Burger");
        super.getTotal();
    }
    
}
