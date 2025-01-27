public class WrapperClass {

     public static void main(String[] args) {
        int num=12;
        Integer num1=num;             // Autoboxing 
        
        System.out.println(num1);
        int num2=num1;                // Auto-unboxing
        System.out.println(num1+num2);
        
    }
}
