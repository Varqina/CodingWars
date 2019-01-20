package Varqina;

public class PangramChecker {
    public static void main(String[] args) {
        PangramChecker pc = new PangramChecker();
        System.out.println(pc.check("You shall not pass!"));

    }
    public boolean check(String sentence){
        char[] tab = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        char [] arrayChar=sentence.toCharArray();
        System.out.println(String.valueOf(tab[0]));
        System.out.println(String.valueOf(arrayChar[0]).toUpperCase());

        for(int i = 0;i<tab.length;i++)
        {

            for ( int j =0;j<arrayChar.length;j++)
            {
                if(tab[i]==arrayChar[j]||String.valueOf(arrayChar[j]).equals(String.valueOf(tab[i]).toUpperCase()))
                {
                    tab[i]='0';
                }
            }
            //System.out.println(tab[i]);
        }
        for ( int i =0;i<tab.length;i++)
        {
            if ( tab[i]!='0')
            {
                return false;
            }
        }
        System.out.println(sentence);

        return true;
    }
}
