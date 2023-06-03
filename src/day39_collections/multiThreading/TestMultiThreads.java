package day39_collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);

        thread1.start(); // to start thread
        thread2.start(); // thread1 and thread2 will run at the same time
    }
}
