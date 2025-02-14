package Java8_01;

import Java8_01.model.User;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

////        Anonymous class
//        UserService userService = new UserService() {
//            @Override
//            public void updateUser() {
//                System.out.println("Update User");
//            }
//        };
//        userService.updateUser();
//
////        Lambda
//        UserService userService1 = () -> System.out.println("Update User");
//        userService1.updateUser();
//
////        method reference
//        UserService userService2 = Main::updateUser;
//        userService2.updateUser();
//
////        default method
//        userService.printUser();
//
////        static method
//        UserService.printUserStatic();

//        Stream API

//        Optional
        User user = new User();
        user.setId(1);
        user.setName("User 1");

        User user2 = new User();
        user2.setId(2);
        user2.setName("User 2");

        User user3 = new User();
        user3.setId(2);
        user3.setName(null);

        List<User> userList = List.of(user, user2);

        List<User> userList2 = null;
//        if (!userList2.isEmpty()) {
//            System.out.println("List is empty");
//        }

        Optional<List<User>> optionalList = Optional.ofNullable(userList);
        optionalList.ifPresent(System.out::println);

//        if (optionalList.isEmpty()) {
//            System.out.println("List is empty");
//        }

        Optional<User> userOptional = Optional.ofNullable(user);
        userOptional.ifPresent(System.out::println);
        if (user != null) {
            System.out.println(user);
        }

        LocalDate today = LocalDate.now();
        LocalDate sunday = today.with(DayOfWeek.SUNDAY);
        LocalDate sunday2 = LocalDate.of(2024, Month.DECEMBER, 1);

        System.out.println(today);
        System.out.println(sunday2);
    }

    public static void updateUser() {
        System.out.println("Update User");
    }
}
