package lesson4;

public class TestNewThread {
    public static void main(String[] args) {

//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " :" + i);
                }
            }
        }, "A");

        Thread t2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " :" + i);
                }
            }, "B"
        );

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " :" + i);
            }
        }, "C"
        );

        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("КОНЕЦ!!!");
    }
}
