
package com.mycompany.wapper;


public class Wapper {

    public static void main(String[] args) {
      Coffee cp=new PlainCoffee();
      
      Coffee cp2=new MilkDecorator(new PlainCoffee());
        System.out.println( cp2.getDescription());
        System.out.println(cp2.getCost());
        
         Coffee cp3=new SugarDecorator(new PlainCoffee());
        System.out.println( cp3.getDescription());
        System.out.println(cp3.getCost());
    }
}
