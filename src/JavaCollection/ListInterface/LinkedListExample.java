package JavaCollection.ListInterface;

import java.util.LinkedList;

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
}
