package StringMain;

public class Main {
    public static void main(String[] args) {
//        Tìm hiểu về đặc điểm và tính chất của String in java
//        in Java, String là 1 lớp đặc biệt and có một ố đặc điểm and tính chất quan trọng
//        Bất biến (Immutable) : Một khi String đc tạo ra, nó kh thể thay đổi. Mỗi thao tác thay đổi nội dung.
//        của String sẽ tạo ra một ob String mới
//        String pool: 1 khu vực bộ nhớ đặc biệt được gọi là "String pool" đc use lưu trữ
//        All object String đc tạo thông qua phép gán trưực tiếp (ví dụ: String str = "hello")
//        if 1 String mới đc tạo and nó đã tồn tại trong String pool, thì tham chiếu đến String đã tồn tại sẽ đc trả về thay vì tạo ra new ob.
//        compare: để ss nội dung của 2 String, u nên to use the method .equal() thay vì operator (toán tử) ==.
//        toán tử == sẽ ss tham chiếu, không phải nội dung.
//        Nối Chuỗi: u can nối các String lại với nhau = toán tử +. However, do tính chất bất biến của String,
//        mỗi thao tác sẽ tạo ra một ob String mới. Điều này có thể dẫn đén hiệu suất kém
//        if u thực hiện nhiều thao tác nối trong 1 vòng lặp. Trong trường hợp đó, user StringBuilder or StringBuffer là 1 lựa chọn tốt.
//        method hữu ích: Lớp String cc nhiều phương thức hữu ích như lenth, charAt(int index),
//        substring(int beginIndex, int endIndex), split(String regex), trim(), toLowerCase(), toUpperCase(),
//        replace(oldChar, newChar), startsWith(String prefix), endsWith(String suffix), contains(CharSequence s),



//        Có bao nhiêu cách để tạo biến String?
//        Có 3 cách chính để tạo 1 biến String in java
//        1 sử dụng toán tử gán =: đây là cách phổ biến nhất để tạo 1 String. khi u tạo 1 String = cách này.
//        java sẽ ktra xem String đó có tồn tại trong String pool hay kh. Nếu có nó sẽ trả về thám chiếu đến.
//        String đã tồn tại. Nếu kh, nó sẽ tạo 1 String mới và thêm nó vào String pool.
        String strInStringPool = "Hello";
//        2. use từ khóa new: khi bạn tạo 1 String bằng cách này, java sẽ luôn tạo 1 đối tượng String mới,
//        ngay cả khi 1 String giôống hệt đã tồn tại trong String pool.
        String strNotStringPool = new String("hello");
//        3. use the method format: Method format cuar lopws String cho phép bạn tạo 1 String mới với định dạng cụ thể. Điều này rất
//        hữu ích khi bạn cần tạo String phức tạp từ nhiều giá trị khác nhau.
        String strFormat = String.format("Hello, %$", "world");
//        Lưu ý: rằng 2 cách thứ 2 sẽ kh tận dụng đc String pool, điều này có thể dẫn đến việc sử dụng bộ nhớ
//        kh hiệu quả nếu bạn tạo nhiều String giống nhau.

//        tìm hiêểu về String pool?
//        String pool, còn đc gọi là Constant String pool, là 1 khu vực bộ nớ đặc biệt trong Heap Memory đc sd để
//        lưu trữ all các ob String đc tọa thông qua phép gán trực tiếp.
//        ( ví dụ: String str = "hello" ). Một số điểm quan trọng về String pool:
//        Tái sử dụng đối tượng: khi 1 String mới đc tạo, JVM sẽ ktra xem String đó có tồn tại trong String pool hay kh.
//        Nêếu có. thì tham chiếu đến String đã tồn tịa sẽ đc trả về thay vì tạo 1 đối tượng mới.
//        điều này giúp tiết kiệm bộ nhớ.
//        Bất biến: Do các String trong Pool là bất biến, nên 1 String cụ tể chỉ cần đc lưu trũ 1 lần.
//        Điều này giúp tiết kiệm và tăng hiệu suất.
//        Tạo bằng từ khóa new: khi bạn tọa 1 String bằng từ khóa new, một đối tuownhgj mới sẽ luôn đc tạo trong Heap Memory,
//        Không phụ thuộc vào việc String đó có tồn tại trong String pool hay kh.
//        điều này có thể dẫn đến việc sd bộ nhớ kh hiệu quả
//        Method intern(): của lớp tring cho phép bạn thêm 1 String vào String pool
//        nếu nó chuưa tồn tại. Nếu String đ tồn tại thì method này sẽ trả về tham chiếu đến String đã tồn tại trong String Pool.
//        ví dụ về việc sd String Pool:
        String strToStringPool = "Hee"; // Tạo 1 String và thêm nps vào String pool
        String strAlreadyInStringPool = "Hello"; // kh tạo 1 ob mới, mà trả về tham chiếu đến String đã tồn tại trong String Pool
        System.out.println(strToStringPool == strAlreadyInStringPool);
//        in ra "true" vì cả 2 tham chiếu đều trỏ đến cùng 1 ob trong String pool

//        Làm sao để ss 2 chuỗi
//        u can ss 2 chuỗi bằng cách sd method equal or equalsIgnoreCase.
//        method equal sẽ ss 2 chuỗi dựa trên nd và phân biệt chữ hoa thường.
//        method equalsIgnoreCase sẽ ss nd mà kh phân biệt chữ hoa thường.
//        Example:
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "hello";
//        equals
        System.out.println(str1.equals(str2)); // output: false vì equals phân biệt hoa thường
        System.out.println(str1.equals(str3)); // output: true
//        equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase(str2)); // In ra "true" vì .equalsIgnoreCase() không phân biệt chữ hoa chữ thường
        System.out.println(str1.equalsIgnoreCase(str3)); // In ra "true"
    }
}