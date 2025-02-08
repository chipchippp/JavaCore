package MemoryAndHandleException.TayJava;

public class Main {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = 10;

//        Integer ketQua = 0;
        try {
            Integer ketQua = a + b;
            System.out.println(ketQua);
        } catch (NullPointerException e) {
            System.out.println("Lỗi null pointer exception " + e);
        }
        method1();
        System.out.println("Hello World");
        
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Lỗi " + e);
        }
    }

    static void method1() {
        System.out.println("Method 1");
        method2();
    }

    static void method2() {
        System.out.println("Method 2");
    }
}
