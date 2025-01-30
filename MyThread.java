public class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("Hello vijay");
            try {
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class MyT{
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
    }
}
