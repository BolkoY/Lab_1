package lab_1_v2_1;

public abstract class Food implements Consumable {
    String name = null;

    public Food (String name){
        this.name = name;
    }
    public boolean equals(Object args){
        if (!(args instanceof Food))
            return false;
        if (name == null || ((Food)args).name==null)
            return false;
        return name.equals(((Food)args).name);
    }
    public String toString (){
        return name;
    }
    public String getName () {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
