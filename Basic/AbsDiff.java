import java.util.Scanner;
public class AbsDiff {
    public static int findCount(int[] arr,int n,int num,int diff){
        
        int count=0;
        for(int i=0;i<n;i++){
            if(Math.abs(num-arr[i])<=diff){
                count++;
            }
        }
        if(count>0)return count;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int num=sc.nextInt();
        int diff=sc.nextInt();
        System.out.println(findCount(arr, n, num, diff));
        // System.out.println(n);
        // for(int val:arr)System.out.print(val+" ");
        // System.out.println(num);
        // System.out.println(diff);
    }
}
