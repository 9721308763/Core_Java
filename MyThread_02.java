public class MyThread_02 extends  Thread{
    
    public void run(){
        for(int i=0;i<20;i--){
            System.out.println("Hello Vijay, Welcome to Java Programming");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class MyThread_03 extends  Thread {
    
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Helllo Vijay, Welcome to MyThread_03 class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyClass{
    public static void main(String[] args) {
        
        // create the object of the thread class
        
        MyThread_02 myThread02=new MyThread_02();
        MyThread_03 myThread03=new MyThread_03();
        
        // Get the default priority of the thread
        System.out.println(myThread02.getPriority());
        System.out.println(myThread03.getPriority());
        
        
        // calling the run method of both thread class
        myThread02.start();
        
        myThread03.start();
        
        
    }
}
