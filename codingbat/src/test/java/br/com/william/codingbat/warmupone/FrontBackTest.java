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
public class FrontBackTest {
    private FrontBack frontBack=new FrontBack();
    public FrontBackTest() {
    }
    
    @Before
    public void setUp() {
       
    }

    /**
     * Test of frontBack method, of class FrontBack.
     */
    @Test
    public void testFrontBack() {
        assertEquals("eodc", frontBack.frontBack("code"));
        assertEquals("a", frontBack.frontBack("a"));
        assertEquals("ab", frontBack.frontBack("ba"));
    }
    
}
