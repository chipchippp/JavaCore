package JavaCollection.ListInterface;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> productList = new ArrayList<>();

        // Thêm sản phẩm
        productList.add("Laptop");
        productList.add("Smartphone");
        productList.add("Tablet");

        // Hiển thị danh sách sản phẩm
        System.out.println("Sản phẩm đầu tiên: " + productList.get(0));

        // Cập nhật sản phẩm
        productList.set(1, "Smartwatch");
        System.out.println("Danh sách sản phẩm sau khi cập nhật: " + productList);

        // Xóa sản phẩm
        productList.remove("Tablet");
        System.out.println("Danh sách sản phẩm sau khi xóa: " + productList);

//        output:
//        Sản phẩm đầu tiên: Laptop
//        Danh sách sản phẩm sau khi cập nhật: [Laptop, Smartwatch, Tablet]
//        Danh sách sản phẩm sau khi xóa: [Laptop, Smartwatch]
    }
}
