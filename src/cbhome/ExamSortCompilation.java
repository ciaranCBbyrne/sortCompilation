/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cbhome;

import java.util.Random;



/**
 *
 * @author Administrator
 */
public class ExamSortCompilation {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Integer[] list = new Integer[20];
        for(int i = 0 ; i<list.length ; i++){
            
            Random rand = new Random();
            int n = rand.nextInt(100);
            list[i] = n;
        }
        
        System.out.println("Before Sort:");
        for(int i=0 ; i<list.length; i++){
            
            System.out.print(list[i]);
            if(i != list.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println();
        
        BubbleSort bubble = new BubbleSort();        
        
        
        OptiBubble optimised = new OptiBubble();
        
        
        InsertionSort insert = new InsertionSort();
        
        
        SelectionSort select = new SelectionSort();
        
        
        MergeSort merge = new MergeSort();
        merge.sort(list);
        
        QuickSort quick = new QuickSort();
        quick.sort(list);
    }
    
}
