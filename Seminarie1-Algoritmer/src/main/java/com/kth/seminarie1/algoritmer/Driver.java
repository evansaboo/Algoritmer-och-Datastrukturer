/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kth.seminarie1.algoritmer;

import edu.princeton.cs.introcs.StdIn;

/**
 *
 * @author Evan
 */
public class Driver {
        public static void main(String[] args) {
           int key = StdIn.readInt();
            IterativePascal itrPascal = new IterativePascal(false, key);
            RecursivePascal recPascal = new RecursivePascal(true, key); 

           
           itrPascal.printPascal(key);
           recPascal.printPascal(key);
           
           System.out.println(recPascal.binom(30, 29));
    }
    
}
