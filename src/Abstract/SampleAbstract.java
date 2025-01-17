package Abstract;

import Core.EmployeeInterface;
import Core.SampleInterface;

public abstract class SampleAbstract implements SampleInterface {
    // abstract method
    public abstract void sayHello(); // abstract method has not body

    // no abstract method has body
    public int calculate(int a, int b) {
        return a + b;
    }

    // Phương thức trừu tượng (không có thân phương thức)
    abstract void makeSound();

    // Phương thức thông thường (có thân phương thức)
    void sleep() {
        System.out.println("Sleeping...");
    }

    // static method
    public static void sayGoodBye() {
        System.out.println("Bye!");
    }

    // constructor
    protected SampleAbstract() {
    }

    // final method
    public final void noChangeBody(){
        System.out.println("Lớp con không được thay đổi nội dung của phương thức này vì nó là final method");
    }
}
