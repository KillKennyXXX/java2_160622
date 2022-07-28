package lesson4;

public class TestThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("New game");
        t.setPriority(10); //1 -> 10 || 5
//        t.setDaemon(true);
        System.out.println(t);


    }
}
