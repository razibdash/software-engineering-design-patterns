
package com.mycompany.strategydesignpattern;

public class StrategyDesignPattern {

    public static void main(String[] args) {
        SortingContext sortingContext=new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);
        SortingContext sortingContext2=new SortingContext(new MergeSortStrategy());
        sortingContext2.performSort(array1);
    }
}
