public class HelloThread extends Thread {

    @Override
   public void run() {
        System.out.println("Hello Thread" + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        HelloThread helloThread = new HelloThread();
        helloThread.start();
    }
    }