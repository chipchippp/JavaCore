package Exercise1;

import java.util.Scanner;

public class Student {
    private String name; // tên của sinh viên
    private int age; // tuổi của sinh viên

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine(); // nhập tên sinh viên
        age = sc.nextInt(); // nhập tuổi sinh viên
    }
}
