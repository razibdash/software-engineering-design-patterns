/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wapper;

/**
 *
 * @author Gcl
 */
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
