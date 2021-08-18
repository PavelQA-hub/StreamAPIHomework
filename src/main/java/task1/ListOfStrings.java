package task1;

import java.util.Arrays;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Anna", "Gerda", "Alex", "Annabel");
        names.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).sorted().forEach(s -> System.out.println("Filtered value: " + s));
    }
}
