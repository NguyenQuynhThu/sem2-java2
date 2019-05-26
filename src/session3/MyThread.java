package session3;

public class MyThread extends Thread {

    public static void main(String args[]){

        MyThread m = new MyThread();

        System.out.println("Ten cua chu de hien tai: " +Thread.currentThread().getName());

        Thread.currentThread().setName("myJavaThread");
        System.out.println("Ten cua chu de da doi: " + Thread.currentThread().getName());

        m.run();

    }

    public void run(){
        for (int i=0; i<20; i++){
            if (i%2 == 0){
                System.out.println(i);
                try {
                    Thread.sleep(1500);
                } catch (Exception E) {}
            }
        }
    }
}
