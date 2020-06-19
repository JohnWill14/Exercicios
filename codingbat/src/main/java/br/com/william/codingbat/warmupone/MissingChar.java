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
public class MissingChar {
    public String missingChar(String str, int n) {
        String ini=new StringBuilder(str).substring(0, n);
        String fim=new StringBuilder(str).substring(n+1, str.length());
        return ini+fim;
    }

}
