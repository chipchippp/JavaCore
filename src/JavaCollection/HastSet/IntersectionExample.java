package JavaCollection.HastSet;

import java.util.HashSet;
import java.util.Set;

public class IntersectionExample {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(1);
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(4);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Tìm giao nhau giữa hai HashSet
        evenNumbers.retainAll(numbers);

        System.out.println(evenNumbers); // [3, 4]

        // Kiểm tra tập con
        boolean isSubset = evenNumbers.containsAll(numbers);
        boolean isSubset2 = evenNumbers.containsAll(evenNumbers);
        // Hiển thị kết quả
        if (isSubset) {
            System.out.println("numbers là tập con của evenNumbers.");
        } else {
            System.out.println("numbers không phải là tập con của evenNumbers.");
        } // numbers không phải là tập con của evenNumbers.

        if (isSubset2) {
            System.out.println("numbers là tập con của evenNumbers.");
        } else {
            System.out.println("numbers không phải là tập con của evenNumbers.");
        } // numbers là tập con của evenNumbers.

//      Nếu set2 = {2, 3} và set1 = {1, 2, 3, 4}, kết quả sẽ là:
//numbers là tập con của evenNumbers.
//        Nếu set2 = {5, 6}, kết quả sẽ là:
//numbers không phải là tập con của evenNumbers.


//        StreamIntersectionExample
        Set<Integer> intersection = evenNumbers.stream()
                .filter(numbers::contains)
                .collect(java.util.stream.Collectors.toSet());

        System.out.println(intersection); // [3, 4]

    }
}
