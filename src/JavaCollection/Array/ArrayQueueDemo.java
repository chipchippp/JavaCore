package JavaCollection.Array;

import java.util.ArrayDeque;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque<>();

        // Thêm phần tử vào cuối
        deque.addLast("A");
        deque.addLast("B");

        // Thêm phần tử vào đầu
        deque.addFirst("C");
        deque.addFirst("D");

        // Hiển thị các phần tử
        System.out.println("Các phần tử trong deque: " + deque);

        // Lấy và xóa phần tử ở đầu
        Object first = deque.pollFirst();
        System.out.println("Phần tử ở đầu: " + first);
        System.out.println("Deque sau khi xóa phần tử ở đầu: " + deque);

        // Lấy nhưng không xóa phần tử ở cuối
        Object last = deque.peekLast();
        System.out.println("Phần tử ở cuối: " + last);


//        push(E e): Thêm phần tử vào đầu hàng đợi (giống như addFirst).
//        pop(): Lấy và xóa phần tử từ đầu hàng đợi (giống như removeFirst).
        // Hoạt động như một ngăn xếp
        deque.push("XYZ");
        System.out.println("Deque sau khi push: " + deque);

        Object popped = deque.pop();
        System.out.println("Phần tử pop ra: " + popped);
        System.out.println("Deque cuối cùng: " + deque);


    }
}
