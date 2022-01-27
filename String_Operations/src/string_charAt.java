public class string_charAt {
    public static void main(String[] args) {
        String s1 = "Volkan";

        //charAt
        System.out.println(s1.charAt(1));

        //Accessing first and last letter
        int strLength = s1.length();
        System.out.println("First letter is: "+ s1.charAt(0) + "\nLast letter is: "+ s1.charAt(strLength-1));

        //Characters at odd positions
        for(int i=0; i<=s1.length()-1; i++){
            if(i%2 == 1){
                System.out.println(s1.charAt(i));
            }
        }

        //Counting Frequency of a character in a String
    /*    Scanner scan = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        String value = scan.nextLine();
        String s3 = "VolkanKaya";
        int count = 0;
        for(int i=0; i<=s3.length()-1; i++){
            char c = s3.charAt(i);
            if(String.valueOf(c).equals(value)){
                count++;
            }
        }
        System.out.println("Frequency of "+value+" is: "+ count); */

        //Counting the Number of Vowels in a String
        countVowels("Volkan Kaya - Java Programming");

    }
    static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }
    static int countVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        System.out.println("String: "+str+ " has: "+count+" Vowels!");
        return count;
    }
}
