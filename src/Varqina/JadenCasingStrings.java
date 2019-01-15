package Varqina;
//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
//
//Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
public class JadenCasingStrings {
    public static void main(String[] args) {
        String test = "Ala ma kota i ciagnie bata";
        long start = System.currentTimeMillis()% 1000000;
        toJadenCase(test);
        long end = System.currentTimeMillis()% 1000000;

        System.out.println(end-start);

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
}
