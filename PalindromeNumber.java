public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        int n1,a,b;
        int rev=0;
        n1=n;
        while(n!=0){
            a=n%10;
             rev=rev*10+a;
             n=n/10;
        }
        if(rev==n1){
            System.out.println("Palindrome No="+n1);
        }else{
            System.out.println("Not a palindrome no is");
        }
    }
}
