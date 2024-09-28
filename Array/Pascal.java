import java.util.*;
public class Pascal{
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> row1=new ArrayList<>();
        row1.add(1);
        ans.add(row1);

        List<Integer> row2=new ArrayList<>();
        row2.add(1);
        row2.add(1);
        ans.add(row2);

        System.out.println(ans);

        int norows=5;

        for(int i=2;i<norows;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            int c=1;
            int ind=0;
            int sum=0;
            List<Integer> prev=ans.get(i-1);
            while(ind<prev.size()){
                sum+=prev.get(ind);
                ind++;
                c++;
                if(c==2){
                    curr.add(sum);
                    c=1;
                    sum=0;
                }
            }
            curr.add(1);
            ans.add(curr);
        }
        System.out.println(ans);
    }
}