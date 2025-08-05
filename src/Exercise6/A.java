package Exercise6;

public class A {
    public int x = 10;

    public void display() {
        System.out.println(this.x);
    }

    public static int count = 0;

//    public A() {
//        count++; // Mỗi lần tạo đối tượng mới, count tăng lên 1
//    }

    public A() {
        System.out.print("A");
    }

//    public String total() {
//        return "A";
//    }
}
