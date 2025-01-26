public class StaticBlock {
   public StaticBlock(){
       System.out.println("Hello I am from default constructor");
   }
   public StaticBlock(String ... name){
       this();
       for(String s:name){
           System.out.println(s);
       }
   }
    static{
        System.out.println("Hello I am from static block1");
    }
    static {
        System.out.println("Hello I am from static block2");
    }
    {
        System.out.println("Hello I am from instance block");
    }
    public void method1(){
        System.out.println("Hello I am from Method 1");
    }
    
    // main method
    public static void main(String[] args) {
        StaticBlock o=new StaticBlock("Vijay","Anita","Sooraj","Vaishnavi","Shivansh");
        o.method1();
    }
}

