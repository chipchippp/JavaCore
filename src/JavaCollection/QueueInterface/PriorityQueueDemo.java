package JavaCollection.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        int[] arr = {40, 10, 35, 20, 25, 30, 15, 5};
//        PriorityQueue queue = new PriorityQueue<>();
//
//        for (int i : arr) {
//            queue.add(i);
//        }
//        while (!queue.isEmpty()) {
//            System.out.print(queue.poll() + " ");
//        }
//        System.out.println("PriorityQueue sau khi xóa: " + queue);
//
//        System.out.println("\n");
//        queue.add(200);
//        queue.add(10);
//        queue.add(20);
//        queue.add(15);
//
//        System.out.println("PriorityQueue ban đầu: " + queue);
//
//        // Lấy phần tử có độ ưu tiên cao nhất (nhỏ nhất trong trường hợp này)
//        System.out.println("Phần tử nhỏ nhất: " + queue.peek());
//
//        System.out.println("Lấy và xóa phần tử nhỏ nhất: " + queue.poll());
//
//        System.out.println("PriorityQueue sau khi xóa: " + queue);


        // Hàng đợi ưu tiên với thứ tự giảm dần
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//
//        pq.add(300);
//        pq.add(5);
//        pq.add(15);
//        pq.add(10);
//        pq.add(200);
//
//        System.out.println("PriorityQueue ban đầu: " + pq);
//
//        // Lấy phần tử có độ ưu tiên cao nhất (lớn nhất trong trường hợp này)
//        System.out.println("Phần tử lớn nhất: " + pq.peek());
//
//        System.out.println("Lấy và xóa phần tử lớn nhất: " + pq.poll());
//
//        System.out.println("PriorityQueue sau khi xóa: " + pq);

        PriorityQueue<Task> pqu = new PriorityQueue<>();
        pqu.offer(new Task(2, "Task 1"));
        pqu.offer(new Task(1, "Task 2"));

//         Lấy phần tử có độ ưu tiên cao nhất (nhỏ nhất trong trường hợp này)
        System.out.println("Phần tử nhỏ nhất: " + pqu.peek());

        System.out.println("Lấy và xóa phần tử nhỏ nhất: " + pqu.poll());
    }
}
