package task3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class User {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Tom", "Anna", "Gerda", "Alex", "Annabel");;
        int age;


        Optional<String> userName = name.stream().filter(s -> s.startsWith("A")).findFirst();
        System.out.printf("User name is: " + userName.get());
    }
}
