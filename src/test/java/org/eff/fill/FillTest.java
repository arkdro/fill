/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eff.fill;

import java.util.Arrays;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user1
 */
public class FillTest {

    private int[] data1() {
        int w = 4;
        int h = 4;
        int[] d = {
            0, 0, 0, 0,
            0, 1, 0, 0,
            0, 1, 1, 0,
            0, 0, 0, 0
        };
        return d;
    }

    public FillTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void fill_test1() {
        int[] d = data1();
        int x = 0;
        int y = 0;
        int old = 0;
        int replace = 2;
        int[] exp = d.clone();
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == old) {
                exp[i] = replace;
            }
        }
        int width = 4;
        int height = 4;
        Fill f = new Fill(d, width, height);
        int[] act = f.fill(x, y, old, replace);
        assertArrayEquals(exp, act);
    }
}
