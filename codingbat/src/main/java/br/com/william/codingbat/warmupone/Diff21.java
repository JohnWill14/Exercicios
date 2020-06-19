// problem: https://codingbat.com/prob/p116624
/*
    Given an int n, return the absolute difference between n and 21, except return 
    double the absolute difference if n is over 21.
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
