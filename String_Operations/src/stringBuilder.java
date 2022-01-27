public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Volkan");
        StringBuilder sb2 = new StringBuilder(" Kaya");
        System.out.println(sb1.append(sb2));
        System.out.println(sb2.insert(2,"java"));
        System.out.println(sb1.reverse());

        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(sb3.replace(1,3,"java"));
        System.out.println(sb3.delete(1,3));

        //Default capacity is 16
        StringBuilder sb4 = new StringBuilder("Java is my favourite language");
        System.out.println(sb4.capacity());
    }
}
