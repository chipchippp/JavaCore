package JavaCollection;

import java.util.HashSet;

public class HastSetDemo {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add(123);

        // Thử thêm phần tử trùng lặp
        hashSet.add("Java");

        System.out.println(hashSet); // [Java, Python, C++]

        // Thử thêm phần tử null
        hashSet.add(null);

        System.out.println(hashSet); // [null, Java, Python, C++]

        System.out.println(hashSet.contains("Java")); // true

        // Xóa phần tử
        hashSet.remove("Java");
        System.out.println("HashSet sau khi xóa 'Java': " + hashSet); // [null, Python, C++]

        System.out.println("Các phần tử trong hashSet: ");
        for (Object obj : hashSet) {
            System.out.println(obj);
        }
    }
}
