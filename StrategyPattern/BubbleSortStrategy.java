
package com.mycompany.strategydesignpattern;

public class BubbleSortStrategy implements SortingStrategy{

    @Override
    public void sort(int[] array) {
       int n=array.length;
       int temp=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(array[i]<array[j]){
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
               }
           }
       }
        System.out.print("BubbleSortStrategy : ");
       for(int i=0;i<n;i++){
           System.out.print(array[i]);
       }
        System.out.println("");
       
    }
    
}
