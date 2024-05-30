package AssignmentsOopInJava.Oop2;

public class Main {
    public static void main(String[] args) {
        Students st1 = new Students(1, "nva", 4.5, 5.5);
        Students st2 = new Students(2, "nvb", 4.9, 6.5);
        Students st3 = new Students();
        st3.nhapData();
        System.out.println("%-20d%-20s%-20f%-20d%", "ma", "name", "Ly", "a");
        System.out.println(st1.toString());
    }
}
