package AssignmentsOopInJava.Oop3;

import java.util.Scanner;

public class PhuongTienGT {
    private String chuXe, hangXe;
    private double giaTri;
    private int dungTich;
    Scanner sc = new Scanner(System.in);
    public void nhapData(){
        System.out.println("Tên chu xe: ");
        this.chuXe = sc.nextLine();
        System.out.println("Tên hang xe: ");
        this.hangXe = sc.nextLine();
        System.out.println("Gia tri xe: ");
        this.giaTri = sc.nextDouble();
        System.out.println("Dung tich xe: ");
        this.dungTich = sc.nextInt();
    }
    public double tinhThue(){
        double gtri = getGiaTri();
        double dt = getDungTich();
        if (dt < 100){
            return gtri / 100;
        } else if (dt >= 100 && dt <= 200) {
            return gtri / 100 * 3;
        } else{
            return gtri / 100 * 5;
        }
    }
    public PhuongTienGT(){}

    public PhuongTienGT(String chuXe, String hangXe, double giaTri, int dungTich) {
        this.chuXe = chuXe;
        this.hangXe = hangXe;
        this.giaTri = giaTri;
        this.dungTich = dungTich;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        String cx = getChuXe();
        String hx = getHangXe();
        double gt = getGiaTri();
        int dt = getDungTich();
        double thue = tinhThue();
        return String.format("%-20s%-20s%-20.2f%-20d%-20.2f", cx, hx, gt, dt, thue);
    }
}
