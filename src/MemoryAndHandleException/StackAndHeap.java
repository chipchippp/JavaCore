package MemoryAndHandleException;

public class StackAndHeap {
    public static void main(String[] args) {
        int i = 1; // Cấp phát tĩnh
        int j = 2; // Cấp phát tĩnh

        StackAndHeap reef = new StackAndHeap(); // Cấp phát động
        reef.foo(i); // Gọi phương thức method1

        int localVariable = 10; // 1. Lưu trên Stack (biến cục bộ)
        Person person = reef.new Person("John"); // 2. Đối tượng `Person` lưu trên Heap
        person.sayHello();
    }

    public void foo(int param) {
        int k = 3; // Cấp phát tĩnh
        System.out.println("param = " + param);
    }

    public class Person {
        private String name; // 3. Thuộc tính `name` lưu trên Heap (trong đối tượng `Person`)

        public Person(String name) { // 4. Tham số `name` của constructor lưu trên Stack
            this.name = name; // 5. Tham số `name` được gán cho thuộc tính `name` trên Heap
        }

        public void sayHello() {
            String greeting = "Hello, " + name; // 6. Biến cục bộ `greeting` lưu trên Stack
            System.out.println(greeting);
        }
    }
}