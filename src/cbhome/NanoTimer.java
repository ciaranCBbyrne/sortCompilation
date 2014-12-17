/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cbhome;

/**
 *
 * @author Administrator
 */
public class NanoTimer implements ITimer{
    
    long startTime;
    long stopTime;
    public long start(){
        
        return(startTime = System.nanoTime());
    }
    public long stop(){
        
        return(stopTime = System.nanoTime());
    }
    public long interval(){
        
        return(stopTime - startTime);
    }
    public void reset(){
        
        startTime = stopTime = 0;
    }
    public void print(Integer[] list){
        
        for(int i=0 ; i<list.length ; i++){
            
            System.out.print(list[i]);
            if(i != list.length-1){
                System.out.print(" , ");
            }            
        }
        System.out.println();
        System.out.println("Time taken = " + (interval()/1000) + " mSecs");
    
    }
}
