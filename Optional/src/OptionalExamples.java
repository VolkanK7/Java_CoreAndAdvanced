import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {

        //ifPresent method
        Optional<String> opt = Optional.of("optional");
        opt.ifPresent(System.out::println);

        //ofNullable
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Volkan");
        System.out.println(name);



    }
}
