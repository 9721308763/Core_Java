public class ExceptionHandling_01 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
       try{
           int c=a/b;
           System.out.println("The division of two number="+c);
       }catch(ArithmeticException e){
           e.printStackTrace();
           System.out.println("Arithmetic exception ");
       }



    }
}
