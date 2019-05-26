package session3;

import java.util.Scanner;

public class CountDownThread {

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String msg = sc.nextLine();
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                int count = 10;
//                for (int i = count; i > 0; i--) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception E) {
//                    }
//                }
//                System.out.println(msg);
//            }
//
//        };
//        new Thread(r).start();

        Scanner sc = new Scanner(System.in);
        int sophut = sc.nextInt();
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                for (int i=sophut-1; i >=0; i--){
                    for (int j=59; j >=0; j--){
                        System.out.println(String.format("%02d", i)+":"+String.format("%02d", j));
                        try {
                        Thread.sleep(1000);
                    } catch (Exception E) {
                    }
                    }
                }
                System.out.println("BUM!!!");
            }

        };
        new Thread(timer).start();

    }
}
