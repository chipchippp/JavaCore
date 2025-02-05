package JavaCollection.ListInterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> actions = new LinkedList<>();

        // Thêm thao tác
        actions.add("Open File");
        actions.add("Edit File");
        actions.add("Save File");

        // Hiển thị danh sách thao tác
        System.out.println("Danh sách thao tác: " + actions);
        //        Danh sách thao tác: [Open File, Edit File, Save File]

        System.out.println("Thao tác ở giữa: " + findMiddle(actions)); // Edit File

        // Thực hiện undo
        actions.addFirst("Undo");
        System.out.println("Danh sách thao tác sau khi undo: " + actions);
        //        Danh sách thao tác sau khi undo: [Undo, Open File, Edit File, Save File]

        // Thực hiện redo
        actions.add(2, "Redo");
        System.out.println("Danh sách thao tác sau khi redo: " + actions);
        //        Danh sách thao tác sau khi redo: [Undo, Open File, Redo, Edit File, Save File]

        // Xóa thao tác
        actions.remove("Edit File");
        System.out.println("Danh sách thao tác sau khi xóa: " + actions);
        //        Danh sách thao tác sau khi xóa: [Undo, Open File, Redo, Save File]
    }

    public static String findMiddle(LinkedList<String> list) {
        if (list == null || list.isEmpty()) {
            return null; // Nếu danh sách rỗng
        }

        // Khởi tạo ListIterator
        ListIterator<String> slowPointer = list.listIterator();
        ListIterator<String> fastPointer = list.listIterator();

        // Di chuyển các con trỏ
        while (fastPointer.hasNext()) {
            slowPointer.next(); // Con trỏ chậm di chuyển 1 bước
            fastPointer.next(); // Con trỏ nhanh di chuyển 1 bước
            if (fastPointer.hasNext()) {
                fastPointer.next(); // Con trỏ nhanh di chuyển thêm 1 bước nếu có thể
            }
        }

        return slowPointer.previous(); // Con trỏ chậm đang ở giữa danh sách
    }

    public static LinkedList<String> reverseLinkedList (LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (String item : list) {
            reversedList.addFirst(item);
        }
        return reversedList;
    }
}
