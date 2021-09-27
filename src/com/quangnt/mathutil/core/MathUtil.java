/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnt.mathutil.core;

/**
 *
 * @author ACER
 */
public class MathUtil {

    //ta viet ham tinh n!=1*2*3*...*n
    //21! tran kieu long
    //ko tinh dc am giai thua
    //0!=1!=1
    //TDD - Test Driven Development - viet test trc khi viet code
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must between 0...20");
        
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
