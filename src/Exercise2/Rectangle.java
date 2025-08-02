package Exercise2;

import java.util.Scanner;

public class Rectangle {
    private double length; // chiều dài của hình chữ nhật
    private double width; // chiều rộng của hình chữ nhật

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble(); // nhập chiều rộng
    }

    public double getArea() {
        return length * width; // tính diện tích
    }

    public double getPerimeter() {
        return 2 * (length + width); // tính chu vi
    }
}
