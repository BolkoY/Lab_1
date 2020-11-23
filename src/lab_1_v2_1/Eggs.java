package lab_1_v2_1;

public class Eggs extends Food {

    private String number;

    public Eggs (){
        super("Eggs");
    }
    
    public Eggs (String number){ //конструктор
        super("Eggs");
        this.number = number;
    }
    @Override
    public void consume(){
        if(this.number ==null)
            System.out.println(this+ " съедено");
        else
            System.out.println( number +" "+this+ " съедено");
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
//    public boolean equals(Object args)
//    {
//        if (super.equals(args)) { // Шаг 1
//            if (!(args instanceof Apple)) return false; // Шаг 2
//            return number.equals(((Apple)args).name); // Шаг 3
//        } else
//            return false;
//    }
}