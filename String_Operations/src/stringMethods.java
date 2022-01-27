import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
        String s1 = "Java string";

        //Concat
        System.out.println(s1.concat(" is immutable"));

        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Program";
        System.out.println(str1.concat(str2).concat(" ").concat(str3).concat("!"));

        //Contains
        System.out.println(s1.contains("Java"));
        //EndsWith
        System.out.println(s1.endsWith("ing"));
        //Equals
        System.out.println(str1.equals(str2));
        //equalsIgnoreCase
        String str4 = "hello";
        System.out.println(str1.equalsIgnoreCase(str4));
        //getBytes
        byte[] barr = str4.getBytes();
        for(int i=0; i<barr.length; i++){
            System.out.println(barr[i]+" ");
        }
        //getChars
        String str5 = "hello Java";
        char[] ch = new char[4];
        try {
            str5.getChars(6,10,ch,0);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println(e);
        }
        //indexOf
        System.out.println(str5.indexOf("Java"));
        System.out.println(str5.indexOf('a',8));
        //lastIndexOf
        System.out.println(str5.lastIndexOf('a'));
        //join
        String joinString = String.join("-","Volkan","Kaya","Java");
        System.out.println(joinString);
        //replace all - replace
        String str6 = "Volkan Kaya";
        System.out.println(str6.replaceAll("a","o"));
        System.out.println(str6.replace("Kaya","Java"));
        //split
        String str7 = "Java string split method";
        String[] words = str7.split("\s");
        for (String word : words)
            System.out.println(word);
        //substring
        System.out.println(str7.substring(5,11));
        //toCharArray
        char[] ch2 = str1.toCharArray();
        for(char ch3 : ch2)
            System.out.println(ch3);
        //toLowerCase - toUpperCase
        System.out.println(str7.toLowerCase());
        System.out.println(str7.toUpperCase());
        String str8 = "Java strİng - POINT";
        System.out.println(str8.toLowerCase(Locale.ENGLISH));
        System.out.println(str8.toLowerCase(Locale.forLanguageTag("tr")));
        //trim
        String str9 = "Java Trim Method   ";
        System.out.println(str9.trim());
    }
}
