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
class SelectionSort {
    
    protected NanoTimer timer = new NanoTimer();
    
    public void sort(Integer[] list){
        
        timer.reset();
        timer.start();
        
        for(int i=0 ; i<list.length ; i++){
            
            int minIndex = i;
            for(int j=i+1 ; j<list.length ; j++){
                
                if(list[j] < list[minIndex]){
                    
                    minIndex = j;
                }
            }
            if(minIndex != i){
                
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
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
