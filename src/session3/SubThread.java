package session3;

//Cach 1: Tao lop con tu lop Thread --> Dung de tao 1 luong don gian
public class SubThread extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread.currentThread().setName("Untitled");
            System.out.println(Thread.currentThread().getName()+" i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception E) {
            }
        }
    }
}


