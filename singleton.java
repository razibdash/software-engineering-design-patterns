
package com.mycompany.test;

public class Test {
    public static void main(String[] args) {

      
      Thread t1 = new Thread(new Runnable(){
          public void run(){
              SingleTon st=SingleTon.getInstance();
          }
      });
      Thread t2 = new Thread(new Runnable(){
          public void run(){
              SingleTon st1=SingleTon.getInstance();
          }
      });
      t1.start();
      t2.start();
     
    }
}
class SingleTon{
    
    static SingleTon instance;
    //this is costructor.
   private SingleTon() {
        System.out.println("Object is created.");
    }  
   //this is singleton function   
   static SingleTon getInstance(){    
       //for uses Threading
       if(instance==null){
           synchronized(SingleTon.class){
               if(instance == null)
                   instance=new SingleTon();
           }
       }
       return instance;
   }
   
   
}