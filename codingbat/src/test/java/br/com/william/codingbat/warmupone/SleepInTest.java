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
public class SleepInTest {
    private SleepIn sleepIn;
    public SleepInTest() {
        sleepIn=new SleepIn();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of sleepIn method, of class SleepIn.
     */
    @Test
    public void testSleepIn() {
        assertEquals(true, sleepIn.sleepIn(false, false));
        assertEquals(false, sleepIn.sleepIn(true, false));
        assertEquals(true, sleepIn.sleepIn(true, true));
    }
    
}
