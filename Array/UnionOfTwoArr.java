import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
            
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        System.out.println(set);
    }
}
