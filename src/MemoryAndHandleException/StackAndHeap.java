package MemoryAndHandleException;

public class StackAndHeap {
    public static void main(String[] args) {
        int i = 1; // Cấp phát tĩnh
        int j = 2; // Cấp phát tĩnh

        StackAndHeap reef = new StackAndHeap(); // Cấp phát động
        reef.foo(i); // Gọi phương thức method1
    }

    public void foo(int param) {
        int k = 3; // Cấp phát tĩnh
        System.out.println("param = " + param);
    }

}
