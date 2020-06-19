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
public class NotString {
    public String notString(String str) {
        if(str.startsWith("not")){
            return str;
            
        }
        return "not "+str;
    }

}
