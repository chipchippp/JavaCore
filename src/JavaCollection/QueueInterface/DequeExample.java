package JavaCollection.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");  // Thêm vào đầu
        deque.addLast("B");   // Thêm vào cuối
        deque.offerFirst("C");
        deque.offerLast("D");

        System.out.println(deque); // [C, A, B, D]

        System.out.println(deque.pollFirst()); // Lấy và xóa phần tử đầu (C)
        System.out.println(deque.pollLast());  // Lấy và xóa phần tử cuối (D)

        System.out.println(deque); // [A, B]

//        deque.removeFirst(); // Xóa phần tử đầu
//        deque.removeLast();  // Xóa phần tử cuối

    }
}
