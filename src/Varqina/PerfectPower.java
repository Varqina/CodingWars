package Varqina;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

//A perfect power is a classification of positive integers:
//
//        In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.
//
//        Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
//
//        Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.
public class PerfectPower {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        isPerfectPower(9999999);
        isPerfectPower(9999999);
        isPerfectPower(9999999);
        isPerfectPower(9999999);
        isPerfectPower(9999999);
        isPerfectPower(8888888);
        isPerfectPower(8888888);
        isPerfectPower(8888888);
        isPerfectPower(8888888);
        isPerfectPower(8888888);
        isPerfectPower(7777777);
        isPerfectPower(512);
        isPerfectPower(16384);
        isPerfectPower(196);
        isPerfectPower(10000);
        long end = System.currentTimeMillis();
        System.out.println(Math.pow(100,2));
        System.out.println("time: "+(end-start));
    }
    public static int[] isPerfectPower(int n) {
        double result=0;
        if(n<4){return null;}
        for (int i=2;i<=Math.log(n)/Math.log(2)+1;i++)
        {
            for(int j =2;j<n;j++)
            {
                result=Math.pow(j,i);
                if(result>n){break;}
                if ( result==n)
                {
                    int[] tab ={j,i};
                    return tab;
                }
            }
        }
        return null;
    }

}


