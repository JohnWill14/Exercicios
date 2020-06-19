// problem: https://codingbat.com/java/Warmup-1
/*
    The parameter weekday is true if it is a weekday, and the parameter 
    vacation is true if we are on vacation. We sleep in if it is not a weekday or 
    we're on vacation. Return true if we sleep in.
*/
package br.com.william.codingbat.warmupone;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}
