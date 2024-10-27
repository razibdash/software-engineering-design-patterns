
package com.mycompany.wapper;

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
