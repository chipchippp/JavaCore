package Exercise4;

public class Entry {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());


        Point vertice1 = new Point(1, 3);
        Point vertice2 = new Point(2, 3);
        Point vertice3 = new Point(4, 2);
        Triangle triangle1 = new Triangle(vertice1, vertice2, vertice3);
        Triangle triangle2 = new Triangle(4, 5, 2, 6, 3, 7);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle2.getPerimeter());
    }
}
