//Problem: https://codingbat.com/prob/p136351

/*
    Given a string, we'll say that the front is the first 3 chars of the string. 
    If the string length is less than 3, the front is whatever is there. Return a 
    new string which is 3 copies of the front.
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Front3 {
    public String front3(String str) {
        if(str.equals(""))return str;
        int cont=3;
        while(cont>str.length()){
            cont--;
        }
        String test=str.substring(0, cont);
        String str2="";
        for(int i=0;i<3;i++)
            str2+=test;
        return str2;
    }
}
