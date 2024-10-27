/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wapper;

/**
 *
 * @author Gcl
 */
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
