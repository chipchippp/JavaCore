package JavaCollection.ListInterface;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> userConnections = new Vector<>();

        // Thêm kết nối
        userConnections.add(1001);
        userConnections.add(1002);
        userConnections.add(1003);

        // Hiển thị danh sách kết nối
        System.out.println("Danh sách kết nối: " + userConnections);
        //        Danh sách kết nối: [1001, 1002, 1003]

        // Xóa kết nối đầu tiên
        userConnections.remove(0);
        System.out.println("Kết nối sau khi xóa: " + userConnections);
        //        Kết nối sau khi xóa: [1002, 1003]
    }
}
