/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wapper;

/**
 *
 * @author Gcl
 */
public class MilkDecorator extends CoffeeDecorator{
    
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
     @Override
    public String getDescription() {
      return  decoratedCoffee.getDescription()+" With Milk";
      
    }

    @Override
    public Double getCost() {
       return decoratedCoffee.getCost()+50;
    }
//    private void setMilk(Coffee decoratorCoffee){
//      System.out.println("Border Color: Red");
//   }
    
}
