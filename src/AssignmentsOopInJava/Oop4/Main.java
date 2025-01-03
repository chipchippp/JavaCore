package AssignmentsOopInJava.Oop4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();

        while (true){
            System.out.println("1. Display customers");
            System.out.println("2. Add customer");
            System.out.println("3. Search customer by phone number");
            System.out.println("4. Update customer");
            System.out.println("5. Delete customer");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    customerManager.displayCustomers();
                    break;
                case 2:
                    addCustomer(customerManager, sc);
                    break;
                case 3:
                    searchCustomerByPhone(customerManager, sc);
                    break;
                case 4:
                    updateCustomer(customerManager, sc);
                    break;
                case 5:
                    deleteCustomer(customerManager, sc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addCustomer(CustomerManager customerManager, Scanner sc){
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        while (!Validator.isNotNullOrEmpty(name)){
            System.out.print("Name cannot be empty. Enter Name: ");
            name = sc.nextLine();
        }

        System.out.println("Enter email: ");
        String email = sc.nextLine();
        while (!Validator.isValidEmail(email)){
            System.out.print("Email cannot be empty. Enter Email: ");
            email = sc.nextLine();
        }

        System.out.println("Enter phone: ");
        String phone = sc.nextLine();
        while (!Validator.isValidPhoneNumber(phone)){
            System.out.print("Phone number cannot be empty. Enter Phone: ");
            phone = sc.nextLine();
        }

        Customers customer = new Customers(name, email, phone);
        customerManager.addCustomer(customer);

    }

    public static void updateCustomer(CustomerManager customerManager, Scanner sc){
        System.out.println("Enter phone number to update: ");
        String phone = sc.nextLine();
        System.out.print("Enter new Name (or leave blank to keep current): ");
        String name = sc.nextLine();
        System.out.print("Enter new Email (or leave blank to keep current): ");
        String email = sc.nextLine();

        customerManager.updateCustomer(phone, name, email);
    }

    public static void searchCustomerByPhone(CustomerManager customerManager, Scanner sc){
        System.out.print("Enter Phone Number to search: ");
        String phone = sc.nextLine();
        customerManager.searchCustomerByPhoneNumber(phone);
    }

    public static void deleteCustomer(CustomerManager customerManager, Scanner sc){
        System.out.print("Enter Phone Number to delete: ");
        String phone = sc.nextLine();
        customerManager.deleteCustomer(phone);
    }
}
