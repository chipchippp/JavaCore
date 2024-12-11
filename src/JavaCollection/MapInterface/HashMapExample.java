package JavaCollection.MapInterface;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(1, "Three"); // Thay thế giá trị key = 1

        System.out.println(hashMap); // {1=Three, 2=Two}
    }
}
