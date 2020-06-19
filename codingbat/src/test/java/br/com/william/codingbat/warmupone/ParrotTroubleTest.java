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
public class ParrotTroubleTest {
    ParrotTrouble parrotTrouble;
    public ParrotTroubleTest() {
        parrotTrouble=new ParrotTrouble();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of parrotTrouble method, of class ParrotTrouble.
     */
    @Test
    public void testParrotTrouble() {
        assertTrue(parrotTrouble.parrotTrouble(true, 6));
        assertTrue(!parrotTrouble.parrotTrouble(true, 7));
        assertTrue(!parrotTrouble.parrotTrouble(false, 6));
    }
    
}
