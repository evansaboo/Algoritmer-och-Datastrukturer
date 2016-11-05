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
public abstract class ErrorPascal implements Pascal{
    public void printInputCheck(int n){
       if(n < 0){
           throw new IllegalArgumentException(
           "Your value can not be less or equal to 0");
       } 
    }
    public void binumInputCheck(int n, int k){
       if( k > n || n < 0 || k < 0){
           throw new IllegalArgumentException(
           "Invalid input");
       }
       
     
    }
}
