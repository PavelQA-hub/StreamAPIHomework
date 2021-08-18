package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4 ,5, 6, 7, 8, 9, 10);
        long count = number.stream().filter(i -> i%2 == 0).count();
        System.out.println(count);
    }
}
