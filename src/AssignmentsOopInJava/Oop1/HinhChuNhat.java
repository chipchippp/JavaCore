package AssignmentsOopInJava.Oop1;

import java.util.Scanner;

public class HinhChuNhat {
    private double length, width;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat(){
    }

    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void nhapData(){
        System.out.println("Nhập Chiều Dài ");
        this.length = sc.nextDouble();
        System.out.println("Nhập Chiều Rộng ");
        this.width = sc.nextDouble();
    }
    public double tinhDientich(){
        length = getLength();
        width = getWidth();
        return  length * width;
    }

    public double chuVi(){
        length = getLength();
        width = getWidth();
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return
                "length = " + getLength() + "\n" +
                "width = " + getWidth() + "\n" +
                        "Dien tich = " + tinhDientich() + "\n" +
                "Chu vi = " + chuVi();
    }
}
