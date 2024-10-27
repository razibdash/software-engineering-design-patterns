
package com.mycompany.wapper;


public class PlainCoffee implements Coffee{
 
    @Override
    public String getDescription() {
        return "this is plan coffee";
    }

    @Override
    public Double getCost() {
        return 100.00;
    }
  
    
}
