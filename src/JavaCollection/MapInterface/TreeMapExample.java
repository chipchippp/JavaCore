package JavaCollection.MapInterface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("B", 2);
        map.put("A", 1);
        map.put("C", 3);

        System.out.println(map); // {A=1, B=2, C=3} (đã sắp xếp) (theo thứ tự key)
    }
}
