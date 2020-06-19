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
public class Or35Test {
    private Or35 or35=new Or35();
    public Or35Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of or35 method, of class Or35.
     */
    @Test
    public void testOr35() {
        assertEquals(true, or35.or35(3));
        assertEquals(true, or35.or35(10));
        assertEquals(false, or35.or35(8));
    }
    
}
