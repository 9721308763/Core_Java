abstract public class AbstractClass
{
    public abstract void method1();
    
    public void method2(){
        System.out.println("I am a non abstract method");
    }
    public void method3(){
        System.out.println("I am a nont abstract method2");
    }
}
class Imp extends AbstractClass{
    public void method1(){
        System.out.println("Hello I am a abstract method1 from Imp class ");
    }

    public static void main(String[] args) {
        Imp ob=new Imp();
        ob.method1();
        ob.method2();
        ob.method3();
        
    }
}
