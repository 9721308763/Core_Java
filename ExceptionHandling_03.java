import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling_03 {
    
    public static void main(String args[])  {
        
        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bf.readLine());
            int b = Integer.parseInt(bf.readLine());
            int c = a / b;
            System.out.println("Division of the two number=" + c);
        }catch(IOException io){
            io.printStackTrace();
            
        }catch(ArithmeticException a){
            a.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ar){
            ar.printStackTrace();
        }
      
       }
}
