import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "volkan"));
        userList.add(new User(2, "kaya"));
        userList.add(new User(3, "ahmet"));
        userList.add(new User(4, "nuri"));
        userList.add(new User(5, "ece"));

        System.out.println("---All List");
        userList.forEach(User -> User.talk());

        //method reference
        List<User> filteredList = userList.stream()
                .filter(user -> user.id > 3)
                .collect(Collectors.toList());
        System.out.println("---Filtered List");
        filteredList.forEach(User::talk);

        //Map
        System.out.println("---Mapped List");
        userList.stream().map(user -> new User(user.id + 100, user.name)).forEach(User :: talk);

        //Create New Map
        System.out.println("---Create New Map");
        Map<Integer,String> userMap = userList.stream()
                .collect(Collectors.toMap(user -> user.id, user -> user.name));
        userMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void talk() {
        System.out.println("Hi my name is " + this.name + " and my id is " + this.id);
    }
}
