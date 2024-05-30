package AssignmentsOopInJava.Oop2;

import java.util.Scanner;

public class Students {
    private int maStudent;
    private String name;
    private Double diemLT, diemTH;

    Scanner sc = new Scanner(System.in);

    public void nhapData(){
        System.out.println("Nhập mã sinh viên: ");
        maStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập điểm sinh viên: ");
        diemLT = sc.nextDouble();
        System.out.println("Nhập điểm sinh viên: ");
        diemTH = sc.nextDouble();
    }

    public double tinhDiemTB(){
        double lt = getDiemLT();
        double th = getDiemTH();
        return ( lt + th * 2) / 3;
    }
    public Students(){}
    public Students(int maStudent, String name, Double diemLT, Double diemTH) {
        this.maStudent = maStudent;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaStudent() {
        return maStudent;
    }

    public void setMaStudent(int maStudent) {
        this.maStudent = maStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(Double diemLT) {
        this.diemLT = diemLT;
    }

    public Double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(Double diemTH) {
        this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        String result = String.format("%-20d%-20s%-20f%-20d%", maStudent, name, diemLT, diemTH);

        return result;
//                "maStudent = " + getMaStudent() + '\n' +
//                " name = " + getName() + '\n' +
//                " diemLT = " + getDiemLT() +
//                " diemTH = " + getDiemTH()
//                        + "Tính điểm trung bình = " + tinhDiemTB();
    }
}
