import java.util.Scanner;
class DecimalToAnyBase{

    //function to convert decimal to any base

     public static int decimalToAnyBase(int num,int base){
        int rev=0;

        int pow=1;
        while(num>0){
            int dig=num%base;
            rev +=dig*pow;
            pow *=10;
            num=num/base;
        }
        return rev;
    }
        //function to convert any base to decimal
        public static int anyBaseToDecimal(int num ,int base){
            int rev=0;
            int pow=1;
            while(num>0){
                int dig=num%10;
                rev +=dig*pow;
                pow *=base;
                num=num/10;
            }
            return rev;
        }

        //function to convert any base to any base
        public static int anyBaseToAnyBase(int num,int base1,int base2){
            int decimal=anyBaseToDecimal(num,base1);
            int result=decimalToAnyBase(decimal,base2);
            return result;
        }
     

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the Decimal number");
        // int num=sc.nextInt();
        // System.out.println("Enter the base to convert into");
        // int base=sc.nextInt();
        // int result=decimalToAnyBase(num,base);
        // System.out.println("The number in base "+base+" is "+result);

        System.out.println("Enter the number in any base");
        int num=sc.nextInt();
        System.out.println("Enter the base of the number");
        int base=sc.nextInt();
        int result=anyBaseToDecimal(num,base);
        System.out.println("The number in decimal is "+result);


    }
    

 }

    