//Problem: https://codingbat.com/prob/p112564
/*
    Return true if the given non-negative number is a multiple of 3 or a multiple 
    of 5. Use the % "mod" operator -- see Introduction to Mod
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Or35 {
    public boolean or35(int n) {
        return (n%3)==0||(n%5)==0;
    }
}
