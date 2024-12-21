import java.util.*;
public class Basics {
    
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);

        
        list.set(1,11);
        System.out.println(list);
        Integer[] arr=list.toArray(new Integer[0]);
    }
}
