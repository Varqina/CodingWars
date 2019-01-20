package Varqina;
//Take a number: 56789. Rotate left, you get 67895.
//
//Keep the first digit in place and rotate left the other digits: 68957.
//
//Keep the first two digits in place and rotate the other ones: 68579.
//
//Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.
public class RotateForAMax {
    public static void main(String[] args) {
        System.out.println((maxRot(56789))==68957);
        System.out.println((maxRot(38458215))==85821534);
        System.out.println((maxRot(11091468097L))==19489710160L);
    }

    public static long maxRot (long n) {
        if ( n <10000){
            return n;
        }
        String number = String.valueOf(n);
        number+=" ";
        char[] array = number.toCharArray();
        long[] arrayLong = new long[array.length-3];
        for ( int i =0;i<=array.length-4;i++)
        {

            array[array.length-1]=array[i];
            for ( int j =i;j<array.length-1;j++)
            {
                array[j]=array[j+1];
            }
            number="";
            for ( int k =0;k<array.length-1;k++)
            {
                number+=array[k];
            }
            arrayLong[i]=Long.parseLong(number);
        }
        arrayLong[arrayLong.length-1]=n;
        long max=arrayLong[0];
        for ( int i=0;i<arrayLong.length;i++) {
            if ( arrayLong[i]>max){
                max = arrayLong[i];
            }
        }
        return max;
    }



    //todo
    // public static long maxRot (long n) {
    //        String num = String.valueOf(n);
    //
    //        for (int i = 0; i < num.length() - 1; i++) {
    //            num = num.substring(0, i) +
    //                    num.substring(i + 1) +
    //                    num.charAt(i);
    //
    //            if (Long.parseLong(num) > n) {
    //                n = Long.parseLong(num);
    //            }
    //        }
    //
    //        return n;
    //    }
}
