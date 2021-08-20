package task3;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class User {
    String name;
    int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<User> user = Arrays.asList(new User("Tom", 15),
                new User("Anna", 25),
                new User("Gerda", 20),
                new User("Alex", 33),
                new User("Annabel", 27)
        );

        //Variant 1
//        Optional<User> userName = user.stream().filter(s -> s.getName().startsWith("A")).findFirst();
//        System.out.printf("User name is: " + userName.get().getName());

        //Variant 2
        user.stream().map(User::getName).filter(n -> n.startsWith("A")).findFirst().ifPresent(n -> System.out.printf("User name is: " + n));
    }
}
