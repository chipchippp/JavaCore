package Polymorphism;

public class SampleOverriding {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, int b) {
        return a + b;
    }

    private String print() {
        return "Hello ";
    }

    private String print(String message) {
        return "Hello " + message;
    }
}
