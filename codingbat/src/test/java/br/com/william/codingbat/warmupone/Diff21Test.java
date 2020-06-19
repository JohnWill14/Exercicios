/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.codingbat.warmupone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Diff21Test {
    private Diff21 diff21;
    public Diff21Test() {
        diff21=new Diff21();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of diff21 method, of class Diff21.
     */
    @Test
    public void testDiff21() {
        assertEquals(2, diff21.diff21(19));
        assertEquals(11, diff21.diff21(10));
        assertEquals(0, diff21.diff21(21));
    }
    
}
