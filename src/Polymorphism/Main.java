package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.finalMethod();

        Animal animal = new Dog(); // Upcasting (Dog → Animal)
        animal.makeSound();

        Dog myDog = (Dog) animal; // Downcasting (Animal → Dog)
        myDog.bark();
    }
}
