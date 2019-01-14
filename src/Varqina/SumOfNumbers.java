package Varqina;
//Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(GetSum(100,100));


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
}
