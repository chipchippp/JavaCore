package StringMain;

public class Main {
    public static void main(String[] args) {
//        Tìm hiểu về đặc điểm và tính chất của String in java
//        in Java, String là 1 lớp đặc biệt and có một số đặc điểm and tính chất quan trọng

//        Bất biến (Immutable) : Một khi String đc tạo ra, nó kh thể thay đổi.
//        Nếu bạn thay đổi một String, Java sẽ tạo một đối tượng mới, thay vì chỉnh sửa đối tượng hiện có.
//        Example:
          String str = "hello";
          str = str + "world";  // Nếu muốn thay đổi nội dung của 1 String, bạn sẽ tạo ra 1 ob mới chứa nội dung mới
          System.out.println(str); // tạo ra 1 ob mới chứa "hello world"

//        String pool: Khu vực bộ nhớ đặc biệt trong Heap dùng để lưu trữ String được tạo bằng phép gán trực tiếp.
//        Nếu một String mới được tạo và nó đã tồn tại trong String Pool,
//        thì tham chiếu đến String đã tồn tại sẽ được trả về thay vì tạo một đối tượng mới.
//        Example:
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); // In ra "true" vì cả 2 tham chiếu đều trỏ đến cùng 1 ob trong String pool
//        compare: để ss nội dung của 2 String, u nên to use the method .equal() thay vì operator (toán tử) ==.
//        operator == sẽ ss tham chiếu, không phải nội dung.
////        Example:
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        if (str1.equals(str2)){
//            System.out.println("Object equal");
//        } else {
//            System.out.println("Object not equal");
//        } // In ra "Object equal" vì nội dung của 2 chuỗi là giống nhau

//        Nối Chuỗi: u can nối các String lại với nhau = toán tử +. However, do tính chất bất biến của String,
//        mỗi thao tác sẽ tạo ra một ob String mới. Điều này có thể dẫn đén hiệu suất kém
//        if u thực hiện nhiều thao tác nối trong 1 vòng lặp. Trong trường hợp đó, user StringBuilder or StringBuffer là 1 lựa chọn tốt.
//        Phương thức hữu ích:
//        length(), charAt(), substring(), split(), trim(), toLowerCase(), toUpperCase(), replace(), startsWith(), endsWith(), contains().

        int a = 5;
        Integer b = Integer.valueOf(5);
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
//        Khi nào nên dùng StringBuilder hoặc StringBuffer thay cho String
//        1. Khi thực hiện nhiều thao tác chỉnh sửa trên chuỗi:
//        String là immutable (bất biến), nghĩa là mỗi lần chỉnh sửa, Java sẽ tạo một đối tượng mới.
//        Điều này làm tiêu tốn bộ nhớ và giảm hiệu suất nếu bạn thực hiện nhiều thao tác trên chuỗi (ví dụ: nối, xóa, thay thế).
//        2. Sự khác biệt giữa StringBuilder và StringBuffer:
//        StringBuilder:
//        Nhanh hơn.
//        Không an toàn trong môi trường đa luồng (không đồng bộ hóa).
//        StringBuffer:
//        Chậm hơn một chút so với StringBuilder.
//                An toàn trong môi trường đa luồng (có đồng bộ hóa).
//        3. Khi nào nên dùng:
//        Dùng StringBuilder: Nếu chương trình của bạn chỉ chạy trên một luồng (single-threaded).
//                Dùng StringBuffer: Nếu chương trình của bạn chạy trong môi trường đa luồng (multi-threaded) và cần đảm bảo tính toàn vẹn dữ liệu.
//        Example:
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += "Hello "; // Mỗi lần nối tạo một đối tượng String mới.
        }
        System.out.println(result); // In ra "Hello Hello Hello Hello Hello"
//        Example:
        StringBuilder result1 = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result1.append("Hello "); // Không tạo đối tượng mới, chỉ thay đổi nội dung.
        }
        System.out.println(result1.toString()); // In ra "Hello Hello Hello Hello Hello"

//        Example:
        StringBuffer result2 = new StringBuffer();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                result2.append("Thread1 ");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                result2.append("Thread2 ");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(result2.toString());
//        In ra "Thread1 Thread1 Thread1 Thread1 Thread1 Thread2 Thread2 Thread2 Thread2 Thread2 "

//        Có bao nhiêu cách để tạo biến String?
//        Có 3 cách chính để tạo 1 biến String in java
//        1 sử dụng toán tử gán =: đây là cách phổ biến nhất để tạo 1 String. khi u tạo 1 String = cách này.
//        java sẽ ktra xem String đó có tồn tại trong String pool hay kh. Nếu có nó sẽ trả về thám chiếu đến.
//        String đã tồn tại. Nếu kh, nó sẽ tạo 1 String mới và thêm nó vào String pool.
        String strInStringPool = "Hello";
//        2. use từ khóa new: khi bạn tạo 1 String bằng cách này, java sẽ luôn tạo 1 đối tượng String mới,
//        ngay cả khi 1 String giống hệt đã tồn tại trong String pool.
        String strNotStringPool = new String("hello");
//        3. use the method format: Method format của lớp String cho phép bạn tạo 1 String mới với định dạng cụ thể. Điều này rất
//        hữu ích khi bạn cần tạo String phức tạp từ nhiều giá trị khác nhau.
        String strFormat = String.format("Hello, ", "world");
//        Lưu ý: rằng 2 cách thứ 2 sẽ kh tận dụng đc String pool, điều này có thể dẫn đến việc sử dụng bộ nhớ
//        kh hiệu quả nếu bạn tạo nhiều String giống nhau.

//        tìm hiểu về String pool?
//        String pool, còn đc gọi là Constant String pool, là 1 khu vực bộ nớ đặc biệt trong Heap Memory đc sd để
//        lưu trữ all các ob String đc tọa thông qua phép gán trực tiếp.
//        ( ví dụ: String str = "hello" ). Một số điểm quan trọng về String pool:
//        Tái sử dụng đối tượng: khi 1 String mới đc tạo, JVM sẽ ktra xem String đó có tồn tại trong String pool hay kh.
//        Nếu có. thì tham chiếu đến String đã tồn tại sẽ đc trả về thay vì tạo 1 đối tượng mới.
//        điều này giúp tiết kiệm bộ nhớ.
//        Bất biến: Do các String trong Pool là bất biến, nên 1 String cụ thể chỉ cần đc lưu trũ 1 lần.
//        Điều này giúp tiết kiệm và tăng hiệu suất.
//        Tạo bằng từ khóa new: khi bạn tọa 1 String bằng từ khóa new, một ob mới sẽ luôn đc tạo trong Heap Memory,
//        Không phụ thuộc vào việc String đó có tồn tại trong String pool hay kh.
//        điều này có thể dẫn đến việc sd bộ nhớ kh hiệu quả
//        Method intern(): của lớp tring cho phép bạn thêm 1 String vào String pool
//        nếu nó chuưa tồn tại. Nếu String đã tồn tại thì method này sẽ trả về tham chiếu đến String đã tồn tại trong String Pool.
//        ví dụ về việc sd String Pool:
        String strToStringPool = "Hee"; // Tạo 1 String và thêm nó vào String pool
        String strAlreadyInStringPool = "Hello"; // kh tạo 1 ob mới, mà trả về tham chiếu đến String đã tồn tại trong String Pool
        System.out.println(strToStringPool == strAlreadyInStringPool);
//        in ra "true" vì cả 2 tham chiếu đều trỏ đến cùng 1 ob trong String pool

//        Làm sao để ss 2 chuỗi
//        u can ss 2 chuỗi bằng cách sd method equal or equalsIgnoreCase.
//        method equal sẽ ss 2 chuỗi dựa trên nd và phân biệt chữ hoa thường.
//        method equalsIgnoreCase sẽ ss nd mà kh phân biệt chữ hoa thường.
//        Example:
//        String str1 = "hello";
//        String str2 = "Hello";
//        String str3 = "hello";
//        equals
//        System.out.println(str1.equals(str2)); // output: false vì equals phân biệt hoa thường
//        System.out.println(str1.equals(str3)); // output: true
////        equalsIgnoreCase
//        System.out.println(str1.equalsIgnoreCase(str2)); // In ra "true" vì .equalsIgnoreCase() không phân biệt chữ hoa chữ thường
//        System.out.println(str1.equalsIgnoreCase(str3)); // In ra "true"
    }
}