/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnt.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author ACER
 */
public class FactorialTest {

    public FactorialTest() {
    }

    @Test
    public void checkFactorialGivenCorrectArgumentReturnWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        //test cases
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));

    }

    @Test(expected = IllegalArgumentException.class)
    //bien ham thanh public static void
    public void checkFactorialGivenWrongArgumentThrowException() {
//        MathUtil.getFactorial(-5);
//        MathUtil.getFactorial(21);
//        MathUtil.getFactorial(22);
        assertEquals(IllegalArgumentException.class, MathUtil.getFactorial(-5));
        assertEquals(IllegalArgumentException.class, MathUtil.getFactorial(21));
        assertEquals(IllegalArgumentException.class, MathUtil.getFactorial(22));
    }
}
