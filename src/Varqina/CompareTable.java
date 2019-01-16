package Varqina;
//Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

public class CompareTable {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,3,4,4};
        int[] b = new int[]{1,4,9,16,16};
        int[] c = new int[]{};
        System.out.println(comp(a,b));


    }
    public static boolean comp(int[] a, int[] b) {
        if(a ==null || b ==null){return false;}
        if(a.length==0 && b.length==0 ){return true;}
        if(a.length==0 || b.length==0 ){return false;}
        int counter=0;
        for(int i =0;i<a.length;i++)
        {
            for ( int j=0;j<b.length;j++)
            {
                if (Math.pow(a[i],2)==b[j])
                {
                    a[i]=3;
                    b[j]=3;
                    counter++;
                    break;
                }
            }

            if(counter-1!=i){return false;}
        }
        return counter==a.length;
        }
    }