import java.text.DecimalFormat;
import java.util.*;

public class ArayList {
    public static void main (String [] args){

       ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i<11; i++){
            list.add(random.nextInt(100));
        }
        list.forEach(item -> {
            System.out.print(item+" ");
        });
        System.out.println();
        list.forEach(item -> {
            System.out.print(item/3+" ");
                    });
        System.out.println();


        Map <String,Double> map = new HashMap<>();
        map.put ("Иван", 76.5);
        map.put ("Анна", 52.3);
        map.put ("Жанна", 50.0);
        map.put ("Пётр", 80.2);
        map.put ("Зухра", 15.7);
        map.put ("Семён", 100.5);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

            }
}
