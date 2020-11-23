package lab_1_v2_1;

public class Cheese extends Food{
    public Cheese(){
        super("Cheese");
    }
    @Override
    public void consume (){
        System.out.println(this + " съеден");
    }
}

