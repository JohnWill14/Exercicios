//Problem: https://codingbat.com/prob/p183592
/*
 Given a string, take the first 2 chars and return the string with the 2 chars 
 added at both the front and back, so "kitten" yields"kikittenki". 
 If the string length is less than 2, use whatever chars are there.
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Front22 {
    public String front22(String str) {
        if(str.equals(""))return str;
        int cont=2;
        if(str.length()==1)cont--;
        String two=str.substring(0, cont);
        return two+str+two;
    }

}
