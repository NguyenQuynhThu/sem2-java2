package session1;

import java.util.HashSet;
import java.util.Scanner;

public class DanhSachSinhVien {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        HashSet<String> dssv = new HashSet<>();

        while (dssv.size() < 10){
            System.out.println("Nhap ten sinh vien: ");
            dssv.add(scanner.nextLine());
        }

        System.out.println("Danh sach sinh vien:");
        for (String sv : dssv){
            System.out.println(sv);
        }
    }

}
