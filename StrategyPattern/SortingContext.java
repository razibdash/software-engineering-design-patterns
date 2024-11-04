
package com.mycompany.strategydesignpattern;


public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
     public void performSort(int[] array) {
       sortingStrategy.sort(array);
    }
}
