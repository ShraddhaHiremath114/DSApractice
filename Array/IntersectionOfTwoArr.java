import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
            
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                ans.add(b[i]);
                set.remove(a[i]);
            }
        }
        System.out.println(ans);
    }
}
