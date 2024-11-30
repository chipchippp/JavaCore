package MemoryAndHandleException.exception;

// Bước 1: Tạo custom exception kế thừa từ Exception (checked exception)
public class InvalidAgeException extends Exception  {
    // Constructor mặc định
    public InvalidAgeException() {
        super("Invalid age provided"); // Gửi thông báo lỗi mặc định
    }

    // Constructor nhận thông điệp lỗi
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor nhận thông điệp lỗi và nguyên nhân
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
