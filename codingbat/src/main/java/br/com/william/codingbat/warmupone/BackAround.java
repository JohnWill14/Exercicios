/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class BackAround {
    public String backAround(String str) {
        char c=str.charAt(str.length()-1);
        return c+str+c;
    }

}
