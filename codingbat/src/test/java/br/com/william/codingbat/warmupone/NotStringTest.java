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
public class NotStringTest {
    private NotString notString;
    public NotStringTest() {
        notString=new NotString();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of notString method, of class NotString.
     */
    @Test
    public void testNotString() {
        assertEquals("not candy", notString.notString("candy"));
        assertEquals("not x", notString.notString("x"));
        assertEquals("not bad", notString.notString("not bad"));
        assertEquals("not is not", notString.notString("is not"));
    }
    
}
