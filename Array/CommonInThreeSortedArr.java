import java.util.ArrayList;

public class CommonInThreeSortedArr{
    public static void main(String[] args) {
        int[] a={1,5,10,20,40,80};
        int[] b={6,7,20,80,100};
        int[] c={3,4,15,20,30,70,80,120};
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length && k<c.length){
            if(a[i]==b[j] && b[j]==c[k]){
                if(ans.contains(a[i])==false){
                    ans.add(a[i]);
                }
                i++;
                j++;
                k++;
            }else{
                if(a[i]<=b[j] && a[i]<=c[k]){
                    i++;
                }else if(b[j]<=a[i] && b[j]<=c[k]){
                    j++;
                }else{
                    k++;
                }
            }
        }
        System.out.println(ans);
    }
}