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
public class HealthyBurger extends Hamburger{

    public HealthyBurger(String breadType, String meatType, double price) {
        super(breadType, meatType, price);
        limAdditions = 4;
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a Healthy Burger");
        super.getTotal();
    }
}
