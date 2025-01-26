public class FibonacciSeries {
    public static void main(String argp[]){
        int a=0;
        int b=1;
        
        System.out.print(a+" "+b+" ");
        for(int i=0;i<10;i++){
            int k=a+b;
            System.out.print(" "+k);
            a=b;
            b=k;
            
        }
                
    }
}
