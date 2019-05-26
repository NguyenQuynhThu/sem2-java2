package assignment3;

import java.util.Scanner;

public class SoNguyenTiepTheo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen: ");
        int a = scanner.nextInt();

        Runnable sotieptheo = new Runnable() {
            @Override
            public void run() {
                for (int i=a+1;; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception E) {}
                    }
                }
        };
        new Thread(sotieptheo).start();
    }
}
