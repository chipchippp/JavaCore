package JavaCollection.SetInterface;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1); // không thêm được vì đã tồn tại
        hashSet.add(null); // Cho phép 1 giá trị null

        System.out.println(hashSet); // [null, 1, 2] (thứ tự không đảm bảo)

    }
}
