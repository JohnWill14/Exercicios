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
public class NearHundredTest {
    private NearHundred nearHundred;
    public NearHundredTest() {
        nearHundred=new NearHundred();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of nearHundred method, of class NearHundred.
     */
    @Test
    public void testNearHundred() {
        assertTrue(nearHundred.nearHundred(93));
        assertTrue(nearHundred.nearHundred(90));
        assertTrue(!nearHundred.nearHundred(89));
    }
    
}
