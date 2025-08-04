package Exercise3;

public class Entry {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A", 20, "Hanoi", 5);
        System.out.println(student1.toString());
        student1.setScore(-7);
        System.out.println("Updated Score: " + student1.getScore());
        student1.setScore(15);
        System.out.println("Updated Score: " + student1.getScore());

        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display();
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getBalance());
    }
}
