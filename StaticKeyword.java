 class StaticKeyword {
    static int i=3433;
    public static void display(){
        System.out.println("The value of the static variable="+i);
    }
}
 class MainClass{
    public static void main(String[] args) {
        StaticKeyword.display();
    }
}
