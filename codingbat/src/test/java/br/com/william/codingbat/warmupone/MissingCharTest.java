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
public class MissingCharTest {
    private MissingChar missingChar=new MissingChar();
    public MissingCharTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of missingChar method, of class MissingChar.
     */
    @Test
    public void testMissingChar() {
        assertEquals("ktten", missingChar.missingChar("kitten", 1));
        assertEquals("itten", missingChar.missingChar("kitten", 0));
        assertEquals("kittn", missingChar.missingChar("kitten", 4));
    }
    
}
