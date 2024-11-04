
package com.mycompany.strategydesignpattern;

public class MergeSortStrategy implements SortingStrategy{

    @Override
    public void sort(int[] array) {
        System.out.println("Marge Sorted");
    }
    
}
