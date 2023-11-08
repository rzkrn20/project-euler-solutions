package org.ki;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            largestPrimeNumber(n);
        }
    }

    public static void largestPrimeNumber(long n){
        long temp;
        long ntemp=n;
        if(n==1)System.out.println(n);
        for (long i=2;i<=ntemp/2;i++){
            if(i==2||i==3||i==5||i==7){
                while(ntemp%i==0){
                    temp = i;
                    ntemp=ntemp/i;
                    if(ntemp==1){System.out.println(temp);break;}
                }
            }
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                while(ntemp%i==0){
                    temp = i;
                    ntemp=ntemp/i;
                    if(ntemp==1){System.out.println(temp);break;}
                }
            }
        }
        if(ntemp!=1)
            System.out.println(ntemp);
    }

}
