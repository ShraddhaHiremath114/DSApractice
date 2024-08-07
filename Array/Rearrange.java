import java.util.LinkedList;
import java.util.Queue;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr={9,4,-2,-1,5,0,-5,-3,2};
        int n=arr.length;

        Queue<Integer> pos=new LinkedList<>();
        Queue<Integer> neg=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        int i=0;
        while (i<n) {
            if(!pos.isEmpty()){
                arr[i]=pos.poll();
                i++;
            }
            if(i<n && !neg.isEmpty()){
                arr[i]=neg.poll();
                i++;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
