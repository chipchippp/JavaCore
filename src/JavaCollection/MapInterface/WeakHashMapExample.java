package JavaCollection.MapInterface;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<Object, String> map = new WeakHashMap<>();
        Object key = new Object();

        map.put(key, "A");

        System.out.println(map); // {java.lang.Object@hashcode=A}

        key = null; // key không còn tham chiếu đến object nào
        System.gc(); // Gọi garbage collector

        System.out.println(map); // {}
    }
}
