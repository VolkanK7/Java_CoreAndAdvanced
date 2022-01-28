import java.util.*;
import java.util.stream.Collectors;

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
        streamOperations.test9();
    }

    //Loop over each element afterward manipulate the object and write to console.
    private void test1(){
        userList.stream()
                .map(u -> {
                    return new User(
                            u.getId(),
                            "X: "+u.getFirstName(),
                            "Y: "+u.getLastName(),
                            u.getAge()+10,
                            u.getNationality());
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Sort the list according to age property.
    private void test2(){
        userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Sort the list according to age, firstName and lastName property.
    private void test3(){
        userList.stream()
                .sorted(Comparator.comparing(User::getAge)
                        .thenComparing(User::getFirstName)
                        .thenComparing(User::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Let’s find out age average and maximum length of firstName.
    private void test4(){
        double avarageAge = userList.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getAverage();

        int maxFirstNameLenght = userList.stream()
                .mapToInt((value) -> {
                    return value.getFirstName().length();
                })
                .summaryStatistics()
                .getMax();

        System.out.println("Avarage Age: " + avarageAge);
        System.out.println("Max FirstName Lenght: " + maxFirstNameLenght);
    }

    //Check if all ages greater than 6.
    private void test5(){
        boolean isAllAgesGreaterThan6 = userList.stream()
                .allMatch(user -> user.getAge() > 6);
        System.out.println(isAllAgesGreaterThan6);
    }

    //Check if any of firstName property’s first character is S.
    private void test6() {
        System.out.println("Test 7");
        boolean isFirstCharS = userList.stream()
                .anyMatch(user -> user.getFirstName().charAt(0) == 'S');
        System.out.println("isFirstCharS " + isFirstCharS);
    }

    //Count different nationalities on the list.
    private void test7() {
        long countDifferentNationalites = userList.stream()
                .map(User::getNationality)
                .distinct()
                .count();
        System.out.println("countDifferentNationalites: " + countDifferentNationalites);
    }

    //Let’s drop out User whose firstName`s first character is M letter and is older than 10.
    private void test8() {
        userList.stream()
                .filter(p -> (p.getFirstName().charAt(0) != 'M'))
                .filter(p -> (p.getAge() > 10))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    //List to Map with stream
    private void test9(){
        Map<Long, String> mappedList = userList.stream().collect(Collectors.toMap(User::getId,User::getFirstName));
        mappedList.forEach((key, value) -> System.out.println(key +":"+ value));
    }
}
