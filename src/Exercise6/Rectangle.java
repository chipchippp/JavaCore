package Exercise6;

public class Rectangle extends Shape implements Ishape1, Ishape2 {
    private double h;
    private double w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public void input() {

    }

    public double primeter() {
        return (h + w) * 2;
    }

    public double area() {
        return h * w;
    }

    @Override
    public void display() {
        System.out.println("Primeter = " + primeter());
        System.out.println("Area = " + area());
    }
}
