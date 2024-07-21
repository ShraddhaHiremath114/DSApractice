import java.util.*;
public class Jul2 {
    public static void main(String[] args) {
        int[] a1={1,2,2,1};
        int[] a2={3,2,4,2};

        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<a1.length;i++){
        //     set.add(a1[i]);
        // }
        // System.out.println(set);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a1.length;i++){
            list.add(a1[i]);
        }
        System.out.println(list);
        
        List<Integer> ans=new ArrayList<>();


        for(int i=0;i<a2.length;i++){
            if(list.contains(a2[i])){
                ans.add(a2[i]);
                list.remove(a2[i]);
            }
        }
        ans.toArray();
        System.out.println(ans);
    }
}
