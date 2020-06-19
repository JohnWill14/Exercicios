/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.codingbat.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class HelloWorldTest {
    private HelloWorld helloWorld;
    public HelloWorldTest() {
        helloWorld=new HelloWorld();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of HellowWord method, of class HelloWorld.
     */
    @Test
    public void testHellowWord() {
        assertEquals("Hello World !",helloWorld.HellowWord() );
    }
    
}
