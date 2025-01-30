public class InnerClass {

    public void method1(){
        System.out.println("Hello I am from method1");
    }
    public void method2(){
        System.out.println("Hello I am from method 2");
    }
    
    static class A{
        
        public void method3(){
            System.out.println("Hello I am from method 3 inner class");
        }
        public void method4(){
            System.out.println("Hello I am from method 4 inner class");
        }
    }
    
}
class M{
    public static void main(String[] args) {
        InnerClass ob=new InnerClass();
          ob.method1();
          ob.method2();
        InnerClass.A ob1=new InnerClass.A();
        ob1.method3();
        ob1.method4();
    }
}
