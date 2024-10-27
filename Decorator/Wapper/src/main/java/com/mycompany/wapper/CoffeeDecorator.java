
package com.mycompany.wapper;


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
