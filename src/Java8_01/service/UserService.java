package Java8_01.service;

@FunctionalInterface
public interface UserService {
    //    int addUser();
    void updateUser();
//    void deleteUser();

    default void printUser() {
        System.out.println("User");
    }

    static void printUserStatic() {
        System.out.println("User Static");
    }

}
