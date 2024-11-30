package MemoryAndHandleException;


import MemoryAndHandleException.exception.AgeValidator;
import MemoryAndHandleException.exception.InvalidAgeException;
import MemoryAndHandleException.exception.InvalidInputException;

public class CustomException {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(19); // Gây ra ngoại lệ
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

//        Ví dụ: Custom Unchecked Exception
        int value = 5;
        if (value < 0) {
            throw new InvalidInputException("Value cannot be negative: " + value);
        }
    }
}
