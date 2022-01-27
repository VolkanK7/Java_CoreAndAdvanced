import java.util.*;
import java.util.stream.Collectors;

public class Map_Examples {
    public static void main(String[] args) {
        Map<Integer,String> users = new HashMap<>();
        users.put(1,"volkan");
        users.put(2,"kaya");
        users.put(3,"user3");
        users.put(4,"user4");
        //remove method
        users.remove(1);
        System.out.println(users);

        //dubbed double-braced hashmap initialization
        Map<Integer,String> users2 = new HashMap<>(){{
           put(1,"user1");
           put(2,"user2");
           put(3,"user3");
        }};
        System.out.println(users2);
        //size and get method
        System.out.println(users2.size());
        System.out.println(users2.get(1));
        //contains method
        System.out.println(users2.containsValue("user2"));
        System.out.println(users2.containsKey(5));
        //replace method
        users2.replace(3,"user4");
        users2.replace(2,"user2","user3");
        System.out.println(users2);
        users2.entrySet().forEach(System.out::println);
        //HashMap to List
        Set<Map.Entry<Integer,String>> entries = users2.entrySet();
        List<Map.Entry<Integer,String>> myList = new ArrayList<>(entries);
        System.out.println(myList);
        //iteration with forEach
        System.out.println("Iteration with forEach");
        users2.forEach((k,v) -> System.out.printf("%d: %s%n",k,v));
        //iteration with for
        System.out.println("Iteration with for");
        for(Map.Entry<Integer,String> pair : users2.entrySet()){
            System.out.printf("%d: %s%n",pair.getKey(),pair.getValue());
        }
        //iteration over keys and values
        System.out.println("Iteration over keys");
        Set<Integer> keys = users2.keySet();
        keys.forEach(System.out::println);
        System.out.println("Iteration over values");
        Collection<String> values = users2.values();
        values.forEach(System.out::println);
        //Filter
        Map<Integer,String> filteredMap = users2.entrySet().stream()
                .filter(map -> map.getValue().length() == 5)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        filteredMap.entrySet().forEach(e -> System.out.println("Filtered item : " + e));
    }
}
