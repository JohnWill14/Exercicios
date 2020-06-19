//Problem: https://codingbat.com/prob/p123384

/*
    Given a string, return a new string where the first and last chars have been
    exchanged.
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class FrontBack {
    public String frontBack(String str) {
        if(str.length()==0)return "";
        char c1=str.charAt(0);
        char c2=str.charAt(str.length()-1);
        if(str.length()>2)
            return c2+(str.subSequence(1, str.length()-1).toString())+c1;
        if(str.length()==2)
            return (""+c2+c1);
        
        return str;
    }

}
