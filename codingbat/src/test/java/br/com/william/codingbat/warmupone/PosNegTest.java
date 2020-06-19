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
public class PosNegTest {
    private PosNeg posNeg;
    
    public PosNegTest() {
        posNeg=new PosNeg();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of posNeg method, of class PosNeg.
     */
    @Test
    public void testPosNeg() {
        assertTrue(posNeg.posNeg(1, -1, false));
        assertTrue(posNeg.posNeg(-1, 1, false));
        assertTrue(posNeg.posNeg(-4, -5, true));
    }
    
}
