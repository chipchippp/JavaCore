package MemoryAndHandleException.exception;

public class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above, but got: " + age);
            }
            System.out.println("Age is valid: " + age);
    }
}
