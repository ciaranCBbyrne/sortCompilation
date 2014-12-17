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
class MergeSort {
    
    protected NanoTimer timer = new NanoTimer();
    
    public void sort(Integer[] list){
        
        System.out.println("-------------MERGE SORT-------------");
        timer.reset();
        timer.start();

        Integer[] tempList = new Integer[list.length];
        mergeSort(list, tempList, 0, list.length-1);
        
        timer.stop();
        timer.print(list);
    }
    
    public void mergeSort(Integer[] list, Integer[] tempList , int start, int end){
        
        if(start<end){
          
            int middle = (start+end)/2;
            mergeSort(list , tempList , start , middle);
            mergeSort(list , tempList , middle+1 , end);
            merge(list , tempList , start , middle , end);
        }
        else return;
    }
    public void merge(Integer[] list, Integer[] tempList, int start, int middle, int end) {
   
        for(int i=start ; i<=end ; i++){
            
            tempList[i] = list[i];
        }
        int left = start;
        int right = middle+1;
        int temp = start;
        
        while(left <= middle && right <= end){
            
            if(tempList[left] < tempList[right]){
                
                list[temp] = tempList[left];
                left++;
            }
            else{
                
                list[temp] = tempList[right];
                right++;                
            }
            temp++;
        }
        while(left <= middle){
            
            list[temp] = tempList[left];
            left++;
            temp++;
        }
        while(right <= end){
            
            list[temp] = tempList[right];
            right++;
            temp++;
        }
    }
}
