import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        //3rd way
        boolean b3 = Pattern.matches(".s","as");
        System.out.println(b + " " + b2 + " " + b3);

        //the . (dot) represents a single character
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)

        System.out.println("metacharacters d...."); //d means digit
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)

        System.out.println("metacharacters D....");//D means non-digit
        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "asdf32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "asdfghj32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "asdf$2"));//false ($ is not matched)


        Scanner scan = new Scanner(System.in);
    /*    System.out.print("Password: ");
        String pw = scan.nextLine();
        if(Pattern.matches("[a-zA-Z0-9]{6}",pw)){
            System.out.println("Password is valid!");
        }else
            System.out.println("Password is invalid!"); */

        //Regex Finder
        while(true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(scan.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(scan.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+
                        matcher.start()+" and ending at index "+matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found.");
            }
        }
    }
}
