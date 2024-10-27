
package com.mycompany.wapper;


public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
      return  decoratedCoffee.getDescription()+" With Sugar";
      
    }

    @Override
    public Double getCost() {
       return decoratedCoffee.getCost()+20;
    }
    
}
