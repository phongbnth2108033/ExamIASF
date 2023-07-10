package BuildClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyNhanVien {
    // Thuoc tinh
    private ArrayList dsnv;
    public QuanLyNhanVien() {
        dsnv = new ArrayList(10);
    }

    // Ham them nhan vien vàoo vao danh sach
    public void themNV(Staff nv) {
        dsnv.add(nv);
    }

    public void nhapdanhsach(Scanner sc) {
        Staff nv;

        System.out.print("Nhap so luong Nhan vien: ");
        int n = sc.nextInt();

        System.out.println("Nhap danh sach Nhan vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien thu " + (i + 1) + " la:");
            nv = new Staff();
            nv.NhapThongTin(sc);

            // Them nhan vien vao danh sach
            themNV(nv);
        }
    }

    // Ham hien thi danh sach nhan vien
    public void hienthidanhsach() {
        int i = 1;
        for (Staff nv : dsnv) {
            System.out.println("Nhan vien thu " + i + " la:");
            nv.HienThiThongTin();
            i++;
        }
    }

    // Ham sap xep nhan vien theo chieu tang dan cua tien luong
    public void sapxeptheoluong() {
        Collections.sort(dsnv, new Sortbyluong());
    }

    // Ham tim kiem sinh vien theo ten
    public void timkiemtheoten(String name) {
        for (Staff nv : dsnv) {
            if (name.equals(nv.getTen())) {
                nv.HienThiThongTin();
            }
        }
    }
}