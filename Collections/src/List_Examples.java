import java.util.*;

public class List_Examples {
    public static void main(String[] args) {

    /*    //Creating List
        ArrayList<String> userList = new ArrayList<>();
        userList.add("volkan");
        userList.add("kaya");
        for(String list1 : userList){
            System.out.println(list1);
        }  */

    /*    //Array To List
        String[] users = {"volkan","kaya"};
        ArrayList<String> list = new ArrayList<>();
        for(String user : users){
            list.add(user);
        }
        System.out.println("Printing List: "+list);  */

    /*    //List To Array
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array"+ Arrays.toString(array));
        System.out.println("Printing List"+ fruitList);  */

    /*    //Get - Set
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        System.out.println("Returning element: "+list.get(1) );
        list.set(0,"Strawberry");
        System.out.println("Returning element: "+list.get(0) );  */

        // Sort List
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        Collections.sort(list);
        list.removeIf(val -> val.equals("Mango"));
        for(String listN : list){
            System.out.println(listN);
        }

    /*    ArrayList<users> user = new ArrayList<>();
        user.add(new users(1,"volkan","24","volkan@gmail"));
        user.add(new users(2,"ad","20","mail@gmail"));
        int size = user.size();
        System.out.println("Size: " +size);
        for(users userList : user){
            System.out.println(userList.id +" "+ userList.name +" "+ userList.age +" "+ userList.mail);
        } */

    }
    private static class users{
        int id;
        String name;
        String age;
        String mail;

        public users(int id, String name, String age, String mail) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.mail = mail;
        }
    }
}