package MemoryAndHandleException;

import java.io.*;

public class Main {
    static int x = 10; // Biến toàn cục, cấp phát tĩnh

    public static void main(String[] args) {
        int y = 20; // Biến cục bộ, cấp phát tĩnh
        int[] arr = new int[x]; // Cấp phát động
        arr = null; // Bộ nhớ động bị gán null

        // Gọi phương thức xử lý ngoại lệ
        try {
            throwsMethod(2);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Gọi throwMethod với giá trị không hợp lệ
//        try {
//            throwMethod(-5);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception from throwMethod: " + e.getMessage());
//        }

        // Gọi phương thức với custom exception
//        try {
//            validateNumber(-10);
//        } catch (MyCustomException e) {
//            System.out.println("Custom exception: " + e.getMessage());
//        }
    }

    public static void throwMethod(int x) {
        // Phát sinh ngoại lệ nếu x < 0
        if (x < 0) {
            throw new IllegalArgumentException("x should be greater than or equal to 0");
        }
    }

    public static void throwsMethod(int x) throws IllegalArgumentException, IOException {
        if (x < 0) {
            throw new IllegalArgumentException("x should be greater than or equal to 0");
        }

        // NullPointerException (được bắt trong try-catch)
        try {
            throw new NullPointerException("NullPointerException occurred!");
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Đọc file bằng try-with-resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/MemoryAndHandleException/file.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws MyCustomException {
        if (number < 0) {
            throw new MyCustomException("Number must be non-negative!");
        }
    }

    // Custom Exception
    public static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }
}
