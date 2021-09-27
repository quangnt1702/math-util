package com.quangnt.mathutil.main;

import com.quangnt.mathutil.core.MathUtil;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        //Test = tay, manual testing
        //MathUtil.getFactorial(-5);
        System.out.println("0!: 1? " + MathUtil.getFactorial(0));
        System.out.println("1!: 1? " + MathUtil.getFactorial(1));
        System.out.println("2!: 2? " + MathUtil.getFactorial(2));
        System.out.println("5!: 120? " + MathUtil.getFactorial(5));
        
    }
}
