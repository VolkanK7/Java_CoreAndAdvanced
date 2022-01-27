import java.util.ArrayList;
import java.util.HashSet;


public class Set_Examples {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>();
        users.add("volkan");
        users.add("kaya");
        users.add("user3");
        users.add("user4");
        System.out.println(users);
        //size and isEmpty methods
        System.out.println(users.size());
        System.out.println(users.isEmpty());
        //remove method
        users.remove("kaya");
        System.out.println(users);

        HashSet<String> users2 = new HashSet<>();
        users2.add("user3");
        users2.add("user4");
        users2.add("user5");
        users2.add("user6");
        //removeAll method
        users2.removeAll(users);
        System.out.println(users2);
        System.out.println(users2.contains("user5"));
        //iteration with for
        for(String user:users2){
            System.out.println(user);
        }
        //iterationg with foreach
        users2.forEach(System.out::println);
        //clear method
        users2.clear();
        System.out.println(users2);
    }
}
