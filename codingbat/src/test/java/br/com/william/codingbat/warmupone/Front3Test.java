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
public class Front3Test {
    private Front3 front3=new Front3();
    public Front3Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of front3 method, of class Front3.
     */
    @Test
    public void testFront3() {
        assertEquals("JavJavJav", front3.front3("Java"));
        assertEquals("ChoChoCho", front3.front3("Chocolate"));
        assertEquals("abcabcabc", front3.front3("abc"));
    }
    
}
