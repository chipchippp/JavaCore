package Exercise6;

public class B extends A {
    public int x = 20;

    @Override
    public void display() {
        System.out.println(this.x);
    }

    public B() {
        System.out.print("B");
    }

//    public String total() {
//        return "B";
//    }
}
