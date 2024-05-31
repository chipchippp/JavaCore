package AssignmentsOopInJava.Oop2;

public class Main {
    public static void main(String[] args) {
        Students st1 = new Students(1, "nva", 4.5, 5.5);
        Students st2 = new Students(2, "nvb", 4.9, 6.5);
        Students st3 = new Students();
        st3.nhapData();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ma", "Name", "LT", "TH", "TB");
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
