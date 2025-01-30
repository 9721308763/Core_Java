public interface MyInterface {
    
    default void show(){
        System.out.println("Hello I am a default method in interface");
    }
    public static void disp(){
        System.out.println("Hello I am a static method from interface");
    }
    // abstract method
    void sayHello();
}
class V implements MyInterface{
    
    public void sayHello(){
        System.out.println("Hello I am a abstract method in Myinterface");
    }

    @Override
    public void show() {
        System.out.println("Implementation from V class");
    }
}
class XYZ{
    
    public static void main(String[] args) {
        MyInterface.disp();
        V ob=new V();
        ob.sayHello();
        ob.show();
        
        
    }
    
}
