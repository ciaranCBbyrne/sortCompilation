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
class QuickSort {
    
    protected NanoTimer timer = new NanoTimer();
    
    public void sort(Integer[] list){
        
        System.out.println("---------------QUICK SORT--------------");
        timer.reset();
        timer.start();
                
        quickSort(list , 0 , list.length-1);
        
        timer.stop();
        timer.print(list);
    }
    public void quickSort(Integer[] list , int start , int end){
        
        if(start < end){
            
            int pivotIndex = partition(list , start , end);
            
            quickSort(list , start , pivotIndex-1);
            quickSort(list , pivotIndex+1 , end);
        }
        else return;
    }
    public int partition(Integer[] list , int start , int end){
        
        int pivot = list[start];
        int up = start+1;
        int down = end;
        
        while(up < down){
            
            while((up<end) && (list[up]<pivot)){
                up++;
            }
            
            while((down>start) && (list[down]>=pivot)){
               
               down--;
            }
            
            if(up < down){
                int temp = list[up];
                list[up] = list[down];
                list[down] = temp;
            }
        }
        list[start] = list[down];
        list[down] = pivot;
        return down;
    }    
}
