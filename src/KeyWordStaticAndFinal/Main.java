package KeyWordStaticAndFinal;

public class Main {
    static final int MY_CONSTANT = 10;
    public final void myFinalMethod() {
        // ...
    }
    public static void main(String[] args) {
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