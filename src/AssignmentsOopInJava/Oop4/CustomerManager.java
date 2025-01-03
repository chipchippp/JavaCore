package AssignmentsOopInJava.Oop4;

import java.util.List;

public class CustomerManager {
    private List<Customers> customers;

    public CustomerManager() {
        customers = FileUtil.readCustomersFromFile();
    }

    public void addCustomer(Customers customer) {
        if (!Validator.isValidPhoneNumber(customer.getPhone())) {
            System.out.println("Invalid phone number");
            return;
        }
        if (!Validator.isValidEmail(customer.getEmail())) {
            System.out.println("Invalid email");
            return;
        }
        if (customers.stream().anyMatch(c -> c.getPhone().equals(customer.getPhone()))) {
            System.out.println("Phone number already exists");
            return;
        }
        customers.add(customer);
        FileUtil.saveCustomersToFile(customers);
        System.out.println("Customer added successfully");
    }

    public void displayCustomers() {
        if (customers.isEmpty()){
            System.out.println("No customers found");
        } else {
            for (Customers customer : customers) {
                System.out.println(customer);
            }
        }
    }

    public void searchCustomerByPhoneNumber(String phone) {
        customers.stream()
                .filter(c -> c.getPhone().equals(phone))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Customer not found"));
    }

    public void updateCustomer(String phone, String name, String email) {
        customers.stream()
                .filter(c -> c.getPhone().equals(phone))
                .findFirst()
                .ifPresent(c -> {
                    if (name != null && !name.isEmpty()) c.setName(name);
                    if (email != null && !email.isEmpty()) c.setEmail(email);
                    FileUtil.saveCustomersToFile(customers);
                    System.out.println("Customer updated successfully!");
                });
    }

    public void deleteCustomer(String phone){
        customers.removeIf(c -> c.getPhone().equals(phone));
        FileUtil.saveCustomersToFile(customers);
        System.out.println("Customer deleted successfully");
    }
}