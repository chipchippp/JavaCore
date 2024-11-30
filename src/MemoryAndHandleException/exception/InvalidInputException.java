package MemoryAndHandleException.exception;

// Ví dụ: Custom Unchecked Exception
public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
