package JavaCollection.HastSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedHashSetExample {
    public static void main(String[] args) {

        Set<String> synchronizedSet  = Collections.synchronizedSet(new HashSet<>());
        synchronizedSet.add("Java");
        synchronizedSet.add("Python");
        synchronizedSet.add("C++");

        // Duyệt qua synchronizedSet phải được đồng bộ hóa
        synchronized (synchronizedSet) {
            for (String str : synchronizedSet) {
                System.out.println(str);
            }
        }
//        Ưu điểm:
//Dễ sử dụng.
//An toàn trong môi trường đa luồng.
//Nhược điểm:
//Hiệu suất thấp hơn so với các Set không đồng bộ hóa.

//        ConcurrentHashSetExample
        Set<String> concurrentSet = ConcurrentHashMap.newKeySet();
        concurrentSet.add("Java");
        concurrentSet.add("Python");
        concurrentSet.add("C++");

        // Duyệt qua Set
        concurrentSet.forEach(System.out::println);

//        Ưu điểm:
//Không cần đồng bộ hóa thủ công khi duyệt.
//Hiệu suất cao hơn so với Collections.synchronizedSet.

//        CopyOnWriteArraySetExample
        CopyOnWriteArrayList<String> copyOnWriteArraySet = new CopyOnWriteArrayList<>();
        copyOnWriteArraySet.add("Java");
        copyOnWriteArraySet.add("Python");
        copyOnWriteArraySet.add("C++");

        // Duyệt qua Set
        for (String str : copyOnWriteArraySet) {
            System.out.println(str);
        }
//        Ưu điểm:
//Không cần đồng bộ hóa khi duyệt.
//Đọc nhanh và an toàn trong môi trường đa luồng.
//Nhược điểm:
//Hiệu suất thấp hơn khi ghi, vì mỗi thao tác ghi sao chép toàn bộ dữ liệu.
    }
}
