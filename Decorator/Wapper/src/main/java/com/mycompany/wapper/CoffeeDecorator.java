/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wapper;

/**
 *
 * @author Gcl
 */
public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    
    
    @Override
    public String getDescription() {
      return  decoratedCoffee.getDescription();
    }

    @Override
    public Double getCost() {
       return decoratedCoffee.getCost();
    }
    
}
