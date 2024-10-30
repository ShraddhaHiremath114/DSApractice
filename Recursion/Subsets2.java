import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2{
    public static void fun(ArrayList<Integer> list,List<List<Integer>> ans,int[] nums,int ind){
        if(ind==nums.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList<>(list));
            }
            
            return;
        }
        //take
        list.add(nums[ind]);
        fun(list, ans, nums, ind+1);
        //backtrack
        list.remove(list.size()-1);
        //not take
        fun(list, ans, nums, ind+1);
    }
    public static void main(String[] args) {
        int[] nums={1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        fun(new ArrayList<>(),ans,nums,0);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        System.out.println(ans.size());
    }
}