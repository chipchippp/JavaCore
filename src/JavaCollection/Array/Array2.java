package JavaCollection.Array;

public class Array2 {
    public static void main(String[] args) {
//        int[] arrA;
//        String[] arrB;
//
//        arrA = new int[]{1, 2, 3, 4, 5};
//        arrB = new String[]{"A", "B", "C", "D", "E"};
//        long[] arrC = {1, 2, 3, 4, 5};
//
//        System.out.println("-------Array A------");
//        for (int i = 0; i < arrA.length; i++){
//            System.out.println(arrA[i]);
//        }
//
//        System.out.println("-------Array B------");
//        for (String s: arrB){
//            System.out.println(s);
//        }
//
//        System.out.println("-------Array C------");
//        for (long l: arrC){
//            System.out.println(l);
//        }

//        mảng 2 chiều
//        int[][] arrA = new int[3][3];
//
//        arrA[0][0] = 1;
//        arrA[0][1] = 2;
//        arrA[0][2] = 3;
//
//        arrA[1][0] = 4;
//        arrA[1][1] = 5;
//        arrA[1][2] = 6;
//
//        arrA[2][0] = 7;
//        arrA[2][1] = 8;
//        arrA[2][2] = 9;
//
//        System.out.println("-------Array A------");
//        for (int i = 0; i < arrA.length; i++){
//            for (int j = 0; j < arrA[i].length; j++){
//                System.out.print(arrA[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] arrB = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        System.out.println("-------Array B------");
//        for (int i = 0; i < arrB.length; i++){
//            for (int j = 0; j < arrB[i].length; j++){
//                System.out.println(arrB[i][j] + " ");
//            }
//        }

        // mảng răng cưa
//        int[][] arrA = new int[3][]; // mảng 2 chiều có 3 hàng
//        arrA[0] = new int[2]; // hang 0 co 2 cot
//        arrA[1] = new int[3]; // hàng 1 có 3 cột
//        arrA[2] = new int[4]; // hàng 2 có 4 cột

//        int arr[][] = new int[3][];
//        arr[0] = new int[3];
//        arr[1] = new int[5];
//        arr[2] = new int[2];
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                arr[i][j] = count++;
//            }
//        }
//
////        in ra mang foreach
//        for (int[] a: arr){
//            for (int i: a){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        mảng clone
//        int[] originalArray = {1, 2, 3, 4, 5};
//        int[] cloneArray = originalArray.clone();
//
//
//        // In cả hai mảng
//        System.out.println("Mảng gốc: ");
//        for (int i: originalArray){
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\nMảng clone: ");
//        for (int i: cloneArray){
//            System.out.print(i + " ");
//        }
//
//        // Thay đổi giá trị của mảng clone
//        cloneArray[0] = 10;
//
//        System.out.println("\n\nSau khi thay đổi mảng gốc:");
//        System.out.println("Mảng gốc: ");
//        for (int i : originalArray) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\nMảng clone: ");
//        for (int i : cloneArray) {
//            System.out.print(i + " ");
//        }

//        Clone mảng nhiều chiều (mảng hai chiều)
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] cloneArray = originalArray.clone();

        // In cả hai mảng
        System.out.println("Mảng gốc: ");
        for (int[] a: originalArray){
            for (int i: a){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nMảng clone: ");
        for (int[] a: cloneArray){
            for (int i: a){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Thay đổi giá trị của mảng clone
        cloneArray[0][0] = 10;

        System.out.println("\n\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int[] a: originalArray){
            for (int i: a){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nMảng clone: ");
        for (int[] a: cloneArray) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

//        – Giải thích:
//Ở mảng hai chiều, khi bạn clone mảng originalArray thì bản thân mảng clonedArray
// được tạo ra nhưng các mảng con (các hàng) vẫn chỉ trỏ tới cùng một vùng nhớ.
// Điều này có nghĩa là khi bạn thay đổi originalArray[0][0] thì clonedArray[0][0] cũng sẽ thay đổi theo
    }
}
