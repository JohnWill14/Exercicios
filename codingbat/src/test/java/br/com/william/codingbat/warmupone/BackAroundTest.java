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
public class BackAroundTest {
    private BackAround backAround=new BackAround();
    public BackAroundTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of backAround method, of class BackAround.
     */
    @Test
    public void testBackAround() {
        assertEquals("tcatt", backAround.backAround("cat"));
        assertEquals("oHelloo", backAround.backAround("Hello"));
        assertEquals("aaa", backAround.backAround("a"));
    }
    
}
