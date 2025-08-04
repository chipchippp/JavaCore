package Exercise2;

public class Customer {
    private String name;
    private char gender;

    public Customer() {
        name = "Unknown";
        gender = 'u';
    }

    public Customer(String name) {
        this.name = name;
        gender = 'u';
    }

    public Customer(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }

    public Customer(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        if (gender == 'u') {
            System.out.println("Gender: Unknown");
        }
        if (gender == 'm') {
            System.out.println("Gender: Male");
        }
        if (gender == 'f') {
            System.out.println("Gender: Female");
        }
    }
}
