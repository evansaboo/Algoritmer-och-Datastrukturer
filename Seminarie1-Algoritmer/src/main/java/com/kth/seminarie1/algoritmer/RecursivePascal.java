/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kth.seminarie1.algoritmer;

/**
 *
 * @author Evan
 */
public class RecursivePascal extends ErrorPascal {
    private boolean flip;
    private int [][] saveArr;
    
    public RecursivePascal(boolean flip, int key ){
        this.printInputCheck(key);
        this.flip = flip;
        this.saveArr = new int[key][];
        for(int i = 0; i < key; i++){
            this.saveArr[i] = new int[i/2+1];
        }      
    } 
  
    @Override 
    public int binom(int n, int k){
         this.binumInputCheck(n, k);
        if ( n == 0 || k == 0 || n == k )
            return 1;
        
        if(k > n/2)
            k = n - k;   
        
        if(this.saveArr[n][k] != 0)
            return this.saveArr[n][k];
        
        this.saveArr[n][k] = binom(n-1, k-1) + binom(n-1, k);
        return this.saveArr[n][k];
    }
    
    @Override
    
    public void printPascal(int n){
        this.printInputCheck(n);
        if(this.saveArr.length == n) n--;

        if(n > 0 && !this.flip) printPascal(n-1);
        for (int j = 0; j <= n; j++)
            System.out.print(binom(n, j) + " ");
        System.out.println();
        if(n > 0 && this.flip) printPascal(n-1);
        }   
    }
