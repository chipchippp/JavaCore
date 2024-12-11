package JavaCollection.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A"); // Thêm phần tử vào queue
        queue.add("B");
        queue.offer("C");

        System.out.println("Queue: " + queue.peek()); // Lấy phần tử đầu tiên trong queue (A)
        System.out.println("Queue: " + queue.poll()); // Lấy và xóa phần tử đầu tiên trong queue (A)

        System.out.println(queue); // [B, C]
    }
}
