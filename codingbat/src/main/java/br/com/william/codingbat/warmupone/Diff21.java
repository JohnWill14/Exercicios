// problem: https://codingbat.com/prob/p116624
/*
    The parameter weekday is true if it is a weekday, and the parameter 
    vacation is true if we are on vacation. We sleep in if it is not a weekday or 
    we're on vacation. Return true if we sleep in.
*/
package br.com.william.codingbat.warmupone;

import  java.lang.Math;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Diff21 {
    public int diff21(int n) {
        int valor=0;
        valor=Math.abs(n-21);
        if(n>21)valor*=2;
        return valor;
    }

}
