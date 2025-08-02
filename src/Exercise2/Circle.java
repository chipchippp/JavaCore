package Exercise2;

public class Circle {
    private double radius; // bán kính của hình tròn

    public Circle(double radius) {
        this.radius = radius; // khởi tạo bán kính
    }

    public double getArea() {
        return Math.PI * radius * radius; // tính diện tích hình tròn
    }

    public double getCircumference() {
        return 2 * Math.PI * radius; // tính chu vi hình tròn
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}
