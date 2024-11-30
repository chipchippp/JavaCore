package JavaCollection;

public class Array {
    public static void main(String[] args) {
        //        Khởi tạo mảng:
        // Cách 1: Khai báo và cấp phát kích thước mảng:
        int[] arr = new int[5];
        String str[] = new String[5];

        str[0] = "Hello";
        str[1] = "World";
        str[2] = "Java";
        str[3] = "Python";
        str[4] = "C++";
        String firstElement = str[0]; // Lấy phần tử đầu tiên của mảng
        System.out.println(firstElement); // Hello

        // Array Traversal
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]  + " ");
        } // Hello World Java Python C++

        //Cách 2: Khai báo mảng và khởi tạo giá trị cho mảng:
        int[] arr2 = {1, 2, 3, 4, 5};

        // Array Traversal
        System.out.print("Array Traversal ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]  + " ");
        } // 1 2 3 4 5

        System.out.println();
        // Array Reversal
        for (int i = 0; i < arr2.length/2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        } // 5 4 3 2 1
        System.out.print("Array Reversal ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]  + " ");
        } // 5 4 3 2 1
        System.out.println();

//      Mảng đa chiều:
//      Ví dụ: Mảng 2D như một bảng với hàng và cột
//        int arr2D[][] = new int[2][3];
        int arr2D[][] = {
                {1, 2, 3}, // Hàng 0
                {4, 5, 6}, // Hàng 1
                {7, 8, 9}, // Hàng 2
                {10, 11, 12} // Hàng 3
        };

        int number = arr2D[1][2]; // Lấy phần tử ở hàng 1, cột 2
        System.out.println(number); // 6

        int number2 = arr2D[3][2]; // Lấy phần tử ở hàng 3, cột 2
        System.out.println(number2); // 12

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        } // 1 2 3 4 5 6 7 8 9 10 11 12

    }
}
