package CreationalDesignPattern.SingletonPattern;

public class Singleton {
    // Instance duy nhất của lớp Singleton
    private static Singleton instance;

    // Constructor private ngăn không cho tạo instance từ bên ngoài
    private Singleton() {}

    // Phương thức public để truy cập instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Tạo instance nếu chưa tồn tại
        }
        return instance; // Trả về instance duy nhất
    }

    public void showMessage() {
        System.out.println("Hello, this is Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();

        // Kiểm tra hai tham chiếu có cùng instance không
        System.out.println(singleton1 == singleton2); // Output: true
    }
}
// Output:
// Hello, this is Singleton!
// true

// Trong ví dụ trên, hàm tạo `Singleton()` được đặt là private để ngăn chặn việc tạo thêm thể hiện từ bên ngoài lớp.
// Phương thức `getInstance()` được sử dụng để kiểm soát việc truy cập vào thể hiện duy nhất.
// Nếu thể hiện chưa được tạo, nó sẽ tạo một thể hiện mới. Nếu thể hiện đã tồn tại, nó sẽ trả về thể hiện đó


