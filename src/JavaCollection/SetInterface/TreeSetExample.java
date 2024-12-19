package JavaCollection.SetInterface;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
//        treeSet.add(null); //  không cho phép phần tử null

        System.out.println(treeSet); // [1, 2, 3] (đã sắp xếp)
        treeSet.remove(2);
        System.out.println(treeSet); // [1, 3]
    }
}
