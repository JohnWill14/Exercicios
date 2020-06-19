// problem: https://codingbat.com/prob/p182873
/*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
*/
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Makes10 {
    public boolean makes10(int a, int b) {
        return (a==10||b==10)||(a+b==10);
    }
}
