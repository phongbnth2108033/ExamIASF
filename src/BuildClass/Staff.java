package BuildClass;

import java.util.Scanner;

public class Staff {
    // Thuoc tinh
    private int id;
    private String ten;
    private double luong;

    public Staff() {

    }
    public Staff(int id, String ten, double luong) {
        this.id = id;
        this.ten = ten;
        this.luong = luong;
    }

    public void NhapThongTin(Scanner sc) {
        System.out.print("\tNhap id: ");
        id = sc.nextInt();
        System.out.print("\tNhap ten: ");
        sc.nextLine();
        ten = sc.nextLine();
        System.out.print("\tNhap luong: ");
        luong = sc.nextDouble();
    }

    public void HienThiThongTin() {
        System.out.println("\tId: " + id);
        System.out.println("\tTen: " + ten);
        System.out.println("\tTien luong: " + luong);
    }

    public double luong() {
        return luong;
    }

    public String getTen() {
        return ten;
    }
}