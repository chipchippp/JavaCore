package Exercise2;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();

//        rectangle.getInformation(); // Nhập thông tin hình chữ nhật
//        rectangle.display(); // Hiển thị thông tin hình chữ nhật

//        Student student = new Student("Nguyen Van A", 20); // Tạo đối tượng sinh viên
//        student.displayInfo(); // Hiển thị thông tin sinh viên
//        Student student2 = new Student("Tran Thi B", 22); // Tạo đối tượng sinh viên khác
//        student2.displayInfo(); // Hiển thị thông tin sinh viên khác

//        Student student = new Student("Nguyen Van A", 20, "Male", 8.8); // Tạo đối tượng sinh viên
//        student.display(); // Hiển thị thông tin sinh viên


//        Circle circle = new Circle(5.0); // Tạo đối tượng hình tròn
//        circle.getArea();
//        circle.getCircumference(); // Tính chu vi hình tròn
//        circle.display(); // Hiển thị thông tin hình tròn


//        Student[] students = new Student[3];
//
//        students[0] = new Student("Tuan", 24, "Male", 8.5);
//        students[1] = new Student("Cuong", 25, "Male", 8.5);
//        students[2] = new Student("Duc", 24, "Male", 8.5);
//
//        for (int i = 0; i < 3; i++) {
//            students[i].display();
//        }

//        // Hiển thị ra màn hình căn bậc 2 của 5
//        System.out.println("Sqrt(5) = " + Math.sqrt(5));
//        // Hiển thị ra màn hình số pi
//        System.out.println("Pi = " + Math.PI);
//        // Hiển thị ra màn hình số lớn nhất trong 2 số
//        System.out.println("Max(345, 43) = " + Math.max(345, 43));

        Student s1 = new Student("Manh", 19, "Male", 8.5);
        Student s2 = new Student("Trung", 19, "Male", 8.5);
        Student s3 = new Student("Kien", 19, "Male", 8.5);
        System.out.println(Student.numberOfStudents);
        s1.x = 20; // Thay đổi giá trị của biến static x
        System.out.print(s1.x + " " + s2.x);
    }
}
