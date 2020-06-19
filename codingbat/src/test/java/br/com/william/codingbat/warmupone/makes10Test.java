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
public class makes10Test {
    private Makes10 makes10;
    
    public makes10Test() {
        makes10=new Makes10();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of makes10 method, of class makes10.
     */
    @Test
    public void testMakes10() {
        assertTrue(makes10.makes10(9, 10));
        assertTrue(!makes10.makes10(9, 9));
        assertTrue(makes10.makes10(1, 9));
    }
    
}
