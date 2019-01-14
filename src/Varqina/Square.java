package Varqina;


//Given an integral number, determine if it's a square number:
//
//    In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
//
//The tests will always use some integral number, so don't worry about that in dynamic typed languages.

//TIME 2202ms
public class Square {

    public static void main(String[] args) {


        System.out.println(isSquare(26));
        System.out.println(isSquare(25));
        System.out.println(isSquare(202007953));
        System.out.println(isSquare(0));

    }

    public static boolean isSquare(int n)
    {
        int a = (int) Math.sqrt(n);
        if ( Math.pow(a,2) == n)
        {
            return true;
        }
        return false;
    }
}
