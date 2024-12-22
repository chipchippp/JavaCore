package CreationalDesignPattern.FactoryPattern;

// Interface Shape
interface Shape {
    void draw();
}

// Các lớp cụ thể Rectangle và Circle
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Lớp Factory để tạo Shape
class ShapeFactory {
    // Phương thức Factory để tạo Shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Sử dụng Factory Method
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Tạo đối tượng Circle
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw(); // Output: Drawing a Circle.

        // Tạo đối tượng Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw(); // Output: Drawing a Rectangle.
    }
}
// Output:
// Drawing a Circle.
// Drawing a Rectangle.

//Trong ví dụ trên, `Shape` là một interface với phương thức `draw()`.
// `Rectangle` và `Circle` là các lớp cụ thể thực hiện interface `Shape`.
// `ShapeFactory` là lớp factory để tạo và trả về các đối tượng của `Rectangle` và `Circle` dựa trên tham số đầu vào.
