import java.util.ArrayList;

public class MoveNegEleToEnd {
    public static void main(String[] args) {
        int[] arr={1,-1,3,2,-7,-5,11,6};
        int n=arr.length;

        //[1, 3, 2, 11, 6, -1, -7, -5]
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)ans.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)ans.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
