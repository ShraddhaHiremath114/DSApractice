import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
       List<Integer> sal=new LinkedList<>();
       sal.add(10);
       sal.add(20);
       sal.add(2,30);
       sal.add(3,40);
       System.out.println(sal);
    }
}