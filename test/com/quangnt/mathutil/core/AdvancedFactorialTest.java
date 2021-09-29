/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnt.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ACER
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //tách toàn bộ data cần test bao gồm input/output
    //ra 1 chỗ để dễ quản lí/theo dõi/thống kê đủ các tình huống cần test hay chưa
    //Ta có thể đặt bộ data này ở file, txt, csv, database
    @Parameters
    public static Object[][] initData() {
//        int a[][] = {{2, 4}, {6, 8}};
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 1720}
        };
    }
    //cần chuẩn bị 2 biến để hướng data cào mảng, sao đó thảy vào hàm test
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    @Test
    public void checkFactorialGivenCorrectArgumentReturnWell() {
        assertEquals(expected, MathUtil.getFactorial(input));
    }

}
