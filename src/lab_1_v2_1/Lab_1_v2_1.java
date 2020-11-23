package lab_1_v2_1;

public class Lab_1_v2_1 {

    //вариантA 9
    public static void main(String[] args) throws Exception{
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        
        for (int i=0; i<args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                // У сыра дополнительных параметров нет
                breakfast[i] = new Cheese();
            } else
            if (parts[0].equals("Eggs")) {
                breakfast[i]= new Eggs(parts[1]);
            } else
            if (parts[0].equals("Apple")) {
                // У яблока – 1 параметр, который находится в parts[1]
                breakfast[i] = new Apple(parts[1]);
            } 
            // ... Продолжается анализ других продуктов для завтрака
        }
        // Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
        // Если элемент не null – употребить продукт
            item.consume();
            else     break;

        // Если дошли до элемента null – значит достигли конца
        // списка продуктов, ведь 20 элементов в массиве было
        // выделено с запасом, и они могут быть не
        // использованы все
        System.out.print("Введите продукт для подсчета ");
        java.io.BufferedReader stndin;
        String food;
        stndin=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        food = stndin.readLine();
        Food[] F= new Food[1];
        if (food.equals("Cheese")) {
        // У сыра дополнительных параметров нет
            F[0] = new Cheese();

        } else
        if (food.equals("Eggs")) {
            F[0]= new Eggs();
        } else
        if (food.equals("Apple")) {
            // У яблока – 1 параметр, который находится в parts[1]
            F[0] = new Apple();
        }

        int counter=0;
        for (int i=0; i<args.length; i++) {
            
            if (F[0].equals(breakfast[i])) {
                
                counter++;
                if(counter==1)  F[0].consume();
            } 
            if (F[0].equals("Eggs")) {
                
                counter++;
                if(counter==1)  F[0].consume();
            } else
            if (F[0].equals("Apple")) {
                
                counter++;
                if(counter==1)  F[0].consume();
            } 
        }
        System.out.println( counter+" раз");
        
        
             
        System.out.println("Всего хорошего!");
    }
    
}
