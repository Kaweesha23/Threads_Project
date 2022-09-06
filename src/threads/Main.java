/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author kawee
 */
public class Main {
    public static void main(String[] args) {
        
        Print p = new Print();
        
        
        
        Thread thread = new Thread(p);
        
        
        thread.start();
        
        //thread.setPriority(10);
        
        System.out.println("Main " + Thread.currentThread().getPriority());
        
        System.out.println("child " + thread.getPriority());
        
        for(int h=0;h<10; h++)
        {
            
        System.out.println("This is from Main Thread:"+Thread.currentThread().getName()+h);
        
        }
        System.out.println("============================");
    }
    
}
