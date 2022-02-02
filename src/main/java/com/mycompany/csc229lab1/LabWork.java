/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229lab1;

/**
 *
 * @author devon
 */
public class LabWork {
    static int getSumOfPrimes(int n) {
        int sum = 0;
        for(int i=2; i <=n; i++)
            if(isPrim(i))
                sum = sum+ i;
        
        return sum;
    }
    static boolean isPrim(int x) {
        for(int i=2; i<x; i++)
            if(x%i == 0)
                return false;
        return true;
    }
    static boolean checkDigit(int x, int digit) {
        String str = ""+x;
        return str.contains(""+digit);
    }
    
    static int getSumofPrimeWithDigit(int n) {
        int sum=0;
        for(int i=2; i<=n; i++)
            if((isPrim(i) &&checkDigit(i, 3)))
                sum = sum+1;
        return sum;
    }
    static int getSumofPrimeWithTwoDigits(int n) {
        int sum=0;
        for(int i=2; i<=n; i++)
            if(isPrim(i) &&checkDigit(i, 3) &&checkDigit(i, 5)) {
                sum = sum+i;
            }
        return sum;
    }

    public static void main(String[] args ) {
        System.out.println(getSumofPrimeWithTwoDigits(15) );
    }
}
