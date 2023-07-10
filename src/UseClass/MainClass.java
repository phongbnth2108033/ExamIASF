package UseClass;

import BuildClass.QuanLyNhanVien;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong quan ly
        QuanLyNhanVien ql = new QuanLyNhanVien();

        ql.nhapdanhsach(sc);

        System.out.println("Danh sach nhan vien vua nhap la:");
        ql.hienthidanhsach();

        ql.sapxeptheoluong();

        System.out.println("Danh sach nhan vien sau khi sap xep la:");
        ql.hienthidanhsach();

        // Nhap ten can tim kiem
        System.out.print("Nhap vao ten nhan vien can tim kiem: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Thong tin nhan vien co ten la " + name + " la:");
        ql.timkiemtheoten(name);

        sc.close();
    }
}