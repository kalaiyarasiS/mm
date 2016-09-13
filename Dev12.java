package dev;

/**
 *
 * @author Student
 */
public class Dev12 {

   
public static int strToInt( String str ){
    int i = 0;
    int num = 0;
    boolean isNeg = false;

    
    if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

   
    while( i < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0'; 
    }

    if (isNeg)
        num = -num;
    return num;
}
}
