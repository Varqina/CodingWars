package Varqina;

import java.util.Arrays;

//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//Complete the method which accepts such an array, and returns that single different number.
//
//The input array will always be valid! (odd-length >= 3)
public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] tab ={2,1,2};
        System.out.println(stray_1(tab));
    }
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return (numbers[0]!=numbers[1])?numbers[0]:numbers[numbers.length-1];
    }
    public static int stray_1(int[] numbers) {
        int result_index=0;
        for ( int i =1;i<numbers.length;i++)
        {
            if(numbers[i]!=numbers[(i+1)%numbers.length]&& numbers[(i+1)%numbers.length]==numbers[(i+2)%numbers.length])
            {
                result_index=i;
                break;
            }
        }

        return numbers[result_index];
    }
}


