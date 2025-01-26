public class VaragsVariable {
    void disp(int ... a){
        for(int i:a){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        VaragsVariable obj =new VaragsVariable();
        obj.disp(1,2,3,4,5,6,7);
    }
}
