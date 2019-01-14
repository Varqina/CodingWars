package Varqina;
//Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(GetSum1(0,3));


    }
    public static int GetSum(int a, int b)
    {
        int max = b;
        int min = a;
        int counter=0;
        if ( a > b)
        {
            max = a;
            min = b;
        }
        for (int i =min;i<=max;i++)
        {
            counter+=i;
        }
        return counter;
    }
    public static int GetSum1(int a, int b)
    {
        return (a+b) * ( Math.abs(a-b)+1)/2;
    }
}
