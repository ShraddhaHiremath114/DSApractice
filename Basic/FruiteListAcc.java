import java.util.*;
public class FruiteListAcc {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tomato");
        list.add("Kanda");
        list.add("Tomato");
        System.out.println(list);

        Set<String> set=new HashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        
        List<String> finalans=new ArrayList<>(set);

        Collections.sort(finalans);

        System.out.println(finalans);
    }
}
