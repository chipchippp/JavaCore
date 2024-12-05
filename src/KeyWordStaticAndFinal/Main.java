package KeyWordStaticAndFinal;

public class Main {
    static final int MY_CONSTANT = 10;
    public final void myFinalMethod() {
        // ...
    }
    final int myFinalVariable; // Biến final, không phải static

    // Constructor
    Main(int value) {
        this.myFinalVariable = value; // Gán giá trị một lần trong constructor
    }

    static int myStaticVariable = 0; // Biến static, chung cho tất cả các đối tượng
    public static void main(String[] args) {

        Main obj1 = new Main(10);
        Main obj2 = new Main(20);

        System.out.println("Obj1: " + obj1.myFinalVariable); // In ra 10
        System.out.println("Obj2: " + obj2.myFinalVariable); // In ra 20

//        Main obj3 = new Main();
//        Main obj4 = new Main();

//        obj3.myStaticVariable = 10; // Thay đổi từ obj3
//        System.out.println("obj3: " + obj3.myStaticVariable); // In ra 10
//        System.out.println("obj4: " + obj4.myStaticVariable); // Cũng in ra 10 (dùng chung biến)

        int sum = MathUtils.add(10, 20);
        int difference = MathUtils.subtract(20, 10);
        System.out.println(sum); // 30
        System.out.println(difference); // 10

        int getStaticVariable = MathUtils.myStaticVariable;
        getStaticVariable = getStaticVariable + 10;
        System.out.println("Old: " + getStaticVariable); // 20

        MathUtils.myStaticVariable = 20;

        int getNewStaticVariable = MathUtils.myStaticVariable;
        System.out.println("New: " + getNewStaticVariable); // 20
//         MY_CONSTANT = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến static final

        MathUtils mathUtils = new MathUtils();
        int staticVariable = mathUtils.getMyStaticVariable();
        System.out.println(staticVariable); // 20
    }
}

final class MyFinalClass {
    // ...
}

class ClassStaticVariable {
    static int staticVariable = 10;
}

class ClassStaticMethod {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class ClassStaticBlock {
    static {
        // static block
    }
}

class ClassStaticClass {
    static class StaticNestedClass {
        // ...
    }
}

class MathUtils {
    static int myStaticVariable = 10;
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    public int getMyStaticVariable() {
        return myStaticVariable;
    }
}