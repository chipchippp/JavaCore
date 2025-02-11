package MemoryAndHandleException.TayJava;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Integer a = null;
//        Integer b = 10;
//
//        try {
//            Integer ketQua = a + b;
//            System.out.println(ketQua);
//        } catch (NullPointerException e) {
//            System.out.println("Lỗi null pointer exception " + e);
//        }
//        method1();
//        System.out.println("Hello World");
//
//        try {
//            String s = null;
//            System.out.println(s.length());
//        } catch (NullPointerException e) {
//            System.out.println("Lỗi " + e);
//        }

//        try {
//            int ketQua = add(0, 1);
//            System.out.println(ketQua);
//        } catch (RuntimeException e) {
//            System.out.println("Lỗi " + e);
//        }

        Main m = new Main();
        List<User> userList = m.getUser();
//        Filter sort gender
        userList.stream().filter(user ->
                user.getGender().equals(Gender.male)
        ).forEach(System.out::println);

//        get address of 3 user
        List<String> addressList = userList.stream().filter(user ->
                user.getGender().equals(Gender.male)
        ).map(User::getAddress).distinct().toList();
        System.out.println(addressList);

        String a = " abc";
        System.out.println(a);
        System.out.println(a.stripLeading());
//        for (User user : userList) {
//            if (user.gender.equals(Gender.male)) {
//                System.out.println(user.username);
//            }
//        }
    }

    List<User> getUser() {
//        User user = new User(1L, "tayjava", "123456", Gender.female, "Hà Nội");
//        User user2 = new User(2L, "locjava", "123456", Gender.male, "Hà Nội");
//        User user3 = new User(3L, "hihijava", "123456", Gender.others, "Hà Nội");
//
//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return List.of(new User(1L, "tayjava", "123456", Gender.female, "Hà Nội")
                , new User(2L, "locjava", "123456", Gender.male, "Hà Nội")
                , new User(3L, "hihijava", "123456", Gender.others, "Hà Nội"));
    }

    static int add(int a, int b) {
        if (a == 0) {
            throw new InvalidParamException("a không được bằng 0");
        }
        return a + b;
    }

    static void method1() {
        System.out.println("Method 1");
        method2();
    }

    static void method2() {
        System.out.println("Method 2");
    }
}
