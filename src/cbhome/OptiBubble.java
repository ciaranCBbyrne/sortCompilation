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
class OptiBubble {
    
    protected NanoTimer timer = new NanoTimer();
    
    public void sort(Integer[] list){
        
        timer.reset();
        timer.start();
        
        for(int i=0 ; i<list.length ; i++){
            
            for(int j=0 ; j<list.length-1-i ; j++){
                
                if(list[j] > list[j+1]){
                    
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
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
