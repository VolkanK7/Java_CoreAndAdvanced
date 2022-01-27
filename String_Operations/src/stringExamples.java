public class stringExamples {
    public static void main(String[] args) {
        String s = "volkan";
        s = s.concat(" kaya");
        System.out.println(s);

        //String compare
        String s1 = "volkan kaya";
        System.out.println(s.equals(s1));
        String s2 = "VOLKAN Kaya";
        System.out.println(s.equalsIgnoreCase(s2));
        String s3 = "kaya";
        System.out.println(s.compareTo(s3));

        //Concatenation
        String s4 = "volkan" + " kaya";
        System.out.println(s4);
        String s5 = 10 + 20 + " volkan " + 40 + 40;
        System.out.println(s5);
        //using stringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(" World");
        StringBuilder sb3 = sb1.append(sb2);
        System.out.println(sb3);
        StringBuilder sb4 = sb1.insert(1,"world");
        System.out.println(sb4);
        //using string.format
        String s6 = String.format("%s%s",s1,s3);
        System.out.println(s6);
        String s7 = String.join(" ",s1,s4);
        System.out.println(s7);
    }
}
