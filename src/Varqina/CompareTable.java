package Varqina;
//Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

public class CompareTable {
    public static void main(String[] args) {
        int[] a = new int[]{0, 144*11, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 0, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
        for (int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
            System.out.println(b[i]);
        }


    }
    public static boolean comp(int[] a, int[] b) {
            if(a.length!=b.length){return false;}
            int counter=0;
            for(int i =0;i<a.length;i++)
            {
                if (a[i]==0){return false;}
                for ( int j=0;j<b.length;j++)
                {
                    if (b[j]==0){return false;}
                    if (b[j]==Math.pow(a[i],2))
                    {
                        a[i]=3;
                        b[j]=3;
                        counter++;
                    }
                }
                if (counter==a.length)
                {
                    return true;
                }
            }

            return false;
        }
    }