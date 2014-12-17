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
class InsertionSort {
    
    protected NanoTimer timer = new NanoTimer();
    
    public void sort(Integer[] list){
        
        timer.reset();
        timer.start();
        
        for(int i=1 ; i<list.length ; i++){
            
            int keyElement = list[i];
            int position = i;
            
            while(position>0 && list[position-1]>keyElement){
                
                list[position] = list[position-1];
                position = position-1;                
            }
            list[position] = keyElement;
        }
        timer.stop();
        
        for(int i=0 ; i<list.length ; i++){
            
            System.out.print(list[i]);
            if(i != list.length-1){
                System.out.print(" , ");
            }            
        }
        System.out.println();
        System.out.println("Time taken = " + (timer.interval()/1000) + " mSecs");
    
    }
}
