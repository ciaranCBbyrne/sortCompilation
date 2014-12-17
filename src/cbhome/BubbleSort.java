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
class BubbleSort {
    
    protected NanoTimer timer = new NanoTimer();
    public void sort(Integer[] list){
        
        timer.reset();
        timer.start();
        
        boolean moreSwaps = true;
        int numElements = list.length;
        
        while(moreSwaps == true){

            moreSwaps = false;
            for(int x = 0 ; x<numElements-1 ; x++){

                if( list[x] > list[x+1]){

                    int temp = list[x];
                    list[x] = list[x+1];
                    list[x+1] = temp;
                    moreSwaps = true;
                }
            }
        }
        
        timer.stop();
        
        for(int i=0 ; i<numElements ; i++){
            
            System.out.print(list[i]);
            if(i != numElements-1){
 
                System.out.print(" , ");
            }            
        }
        System.out.println();
        System.out.println("Time taken = " + (timer.interval()/1000) + " mSecs");        
    } 
}
