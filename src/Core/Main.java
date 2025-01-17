package Core;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        lặp chồng lặp (++)
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        lặp chồng lặp (--)
//        for (int i = 1; i < 10; i++){
//            for (int j = 10; j >= i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // foreach
//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("C++");
//        list.add("C#");
//
//        for (String item : list){
//            System.out.println(item);
//        }

        // while
//        int i = 4;
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }

        // do while
//        int y = 5;
//        do {
//            System.out.println(y);
//            y++;
//        } while (y < 10);

        // break
//        for (int i = 0; i < 10; i++){
//            if (i == 5){
//                break;
//            }
//            System.out.println(i);
//        }

        // continue
//        for (int i = 0; i < 10; i++){
//            if (i == 5){
//                continue;
//            }
//            System.out.println(i);
//        }

//        User user = new User();
//        user.setId(1);
//        user.setFirstName("John");
//        user.setLastName("Doe");
//
//        List<User.Address> addresses = new ArrayList<>();
//        User.Address address1 = new User.Address();
//        address1.setCity("Hanoi");
//        address1.setCountry("Vietnam");
//        address1.setStreet("123");
//        addresses.add(address1);
//
//        User.Address address2 = new User.Address();
//        address2.setCity("Saigon");
//        address2.setCountry("Vietnam");
//        address2.setStreet("123");
//        addresses.add(address2);
//
//        user.setAddress(addresses);
//
//        User user1 = new User(1, "John", "Doe", null);
//
//        System.out.println(user);
//        System.out.println("=========");
//        System.out.println(user1);

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John");

        System.out.println(employee.toString());
    }
}
