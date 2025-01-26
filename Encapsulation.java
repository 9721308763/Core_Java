import static java.lang.System.out;
public class Encapsulation {
    private String name;
    private long roll;
    
    // setters
    public void setName(String name){
        this.name=name;
    }
    public void setRoll(long roll){
        this.roll=roll;
    }
    
    // Getters
    public String getName(){
        return name;
    }
    public long getRoll(){
        return roll;
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
                e.setName("Vijay Chaurasiya");
                e.setRoll(972130876);
                out.println(e.getName());
                out.println(e.getRoll());

    }
}
