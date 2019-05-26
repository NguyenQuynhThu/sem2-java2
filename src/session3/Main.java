package session3;//thread

import sun.jvm.hotspot.debugger.ThreadAccess;

public class Main {

    public static void main(String args[]) {

        //Chay cach 1
        /* SubThread t = new SubThread();
        t.setName("Luong thu nhat");
        t.start();
        Thread.currentThread().setName("Set lai ten cho main");

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception E) {
            }
        } */

        //Chay cach 2
        RunThread r = new RunThread();
        Thread tr = new Thread(r);
        tr.start();

        int XYZ = 100;

        //Su dung lop an danh
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < XYZ; i++) {
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception E) {
                    }
                }
            }
        };

        new Thread(r2).start();

    }
}
