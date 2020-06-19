//Problem: https://codingbat.com/prob/p159227

/*
    Given 2 int values, return true if one is negative and one is positive. 
    Except if the parameter "negative" is true, then return true only if both are 
    negative.
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return a<0&&b<0;
        }
        return (a<0&&b>0)||(b<0&&a>0);
    }
    
}
