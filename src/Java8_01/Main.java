package Java8_01;

import Java8_01.model.User;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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

//        Optional<User> userOptional = Optional.ofNullable(user);
//        userOptional.ifPresent(System.out::println);
//        if (user != null) {
//            System.out.println(user);
//        }
//
//        LocalDate today = LocalDate.now();
//        LocalDate sunday = today.with(DayOfWeek.SUNDAY);
//        LocalDate sunday2 = LocalDate.of(2024, Month.DECEMBER, 1);
//
//        System.out.println(today);
//        System.out.println(sunday2);

        //        int[] numbers = {3, 2, 5, 1, 4};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        System.out.println("Sau khi sắp xếp");
//
//        Arrays.parallelSort(numbers);
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        Predicate<String> isLonger = s -> s.length() > 8;
//        System.out.println(isLonger.test("Hello World"));

//        Predicate<Boolean> isLonger2 = l1 -> isLonger.test("TRUE") != Boolean.TRUE;
//        System.out.println(isLonger2.test(Boolean.FALSE));

//        Function<String, Integer> stringToInteger = s -> s.length();
//        System.out.println(stringToInteger.apply("Hello World"));

//        Consumer<String> print = s -> System.out.println(s);
//        print.accept("Hello World");

//        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
//        System.out.println(sum.apply(2, 3));
//        BiFunction<Integer, Integer, Integer> devide = (a, b) -> a / b;
//        System.out.println(sum.apply(4, 2));
//
//        UnaryOperator<Integer> square = (a) -> a * a;
//        System.out.println(square.apply(5));
//
//        BinaryOperator<Integer> multiply = (a, b) -> a * b;
//        System.out.println(multiply.apply(2, 3));


        SampleFunctionalInterface sampleFI = new SampleFunctionalInterface() {
            @Override
            public void printMessage() {
                System.out.println("cách viết cũ");
            }
        };
        sampleFI.printMessage();

        SampleFunctionalInterface myFI = () -> System.out.println("cách viết mới");
        myFI.printMessage();

//        sử dụng biểu thức lambda
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello World");

//        sử dụng tham chiếu phương thức (method reference)
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello World");
    }

    public static void updateUser() {
        System.out.println("Update User");
    }
}
