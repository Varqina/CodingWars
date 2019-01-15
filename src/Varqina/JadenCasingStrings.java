package Varqina;

import java.util.Arrays;
import java.util.stream.Collectors;

//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
//
//Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
public class JadenCasingStrings {
    public static void main(String[] args) {
        String test = "Ala ma kota DSSA GGF asdfdasfjkasdkf asdfsdafgsyda 1321 faga 743  445566 42 dfsd  sghj a s sd f g  kk  h h    dsd gdsfg sfd gsfd gsfd sfgd";
        long start = System.currentTimeMillis()% 1000000;
        toJadenCase(test);
        long end = System.currentTimeMillis()% 1000000;

        System.out.println(end-start);
        System.out.println(toJadenCase(test));

    }
    public static String toJadenCase(String phrase) {
        if(phrase == null||phrase.equals("")){return null;}
        StringBuilder result = new StringBuilder();
        phrase=phrase.toLowerCase();
        result.append(phrase.substring(0,1).toUpperCase());
        for (int i =1; i<phrase.length();i++)
        {
            result.append(phrase.substring(i,i+1));
            if (i+1<phrase.length() && phrase.substring(i,i+1).equals(" "))
            {
                result.append(phrase.substring(i+1,i+2).toUpperCase());
                i++;

            }
        }

        return result.toString();
    }
    public String toJadenCase_2(String phrase) {
        if(phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }
    public String toJadenCase_3(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

}
