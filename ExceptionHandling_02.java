public class ExceptionHandling_02 {

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7};
        try{
            System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundException !");
            
        }

    }
}
