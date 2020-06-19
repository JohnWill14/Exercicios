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
public class Front22Test {
    private Front22 front22=new Front22();
    public Front22Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of front22 method, of class Front22.
     */
    @Test
    public void testFront22() {
        assertEquals("kikittenki", front22.front22("kitten"));
        assertEquals("HaHaHa", front22.front22("Ha"));
        assertEquals("ababcab", front22.front22("abc"));
    }
    
}
