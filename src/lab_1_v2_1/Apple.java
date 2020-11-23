package lab_1_v2_1;

public class Apple extends Food {

    private String size;

    public Apple (){
        super("Яблоко");
    }

    public Apple (String size) {
        super("Яблоко");
        this.size = size;
    }
    @Override
    public void consume(){
        if(this.size ==null)
            System.out.println(this+ " съедено");
        else
            System.out.println(this.name + " " + size +" съедено");
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public String toString (){
        if(this.size ==null)
            return super.toString();
        else
            return super.toString() + " размера '" +size+"'";
    }
//    public boolean equals(Object args) {
//        if (super.equals(args))
//        {
//            if (!(args instanceof Apple)) return false; // Шаг 2
//            return size.equals(((Apple)args).size); // Шаг 3
//        } else
//            return false;
//    }
}
