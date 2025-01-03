package AssignmentsOopInJava.Oop4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "src/AssignmentsOopInJava/Oop4/customers.txt";

    public static List<Customers> readCustomersFromFile() {
        List<Customers> customers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                if (data.length == 3) {
                    customers.add(new Customers(data[0], data[1], data[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return customers;
    }

    public static void saveCustomersToFile(List<Customers> customers){
        try (BufferedWriter bw = new BufferedWriter (new FileWriter(FILE_PATH))){
            for (Customers customers1 : customers){
                bw.write(customers1.getName() + "," + customers1.getPhone() + "," + customers1.getEmail() + "\n");
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
