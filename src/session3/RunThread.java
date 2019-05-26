package session3;

public class RunThread implements Runnable {

    //Cach 2: Implement interface Runable
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception E) {}
        }

    }
}
