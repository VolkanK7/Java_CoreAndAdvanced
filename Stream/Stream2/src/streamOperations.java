import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamOperations {

    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN"));

    public static void main(String[] args) {
        streamOperations streamOperations = new streamOperations();
        streamOperations.test1();
    }

    private void test1(){
        userList.stream()
                .forEach(System.out::println);
    }
}
