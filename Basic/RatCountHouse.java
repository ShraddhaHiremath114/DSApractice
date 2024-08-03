import java.util.Scanner;
public class RatCountHouse {
    public static int solve(int rat,int unit,int n,int[] arr){
        if(arr==null)return -1;
        int total=rat*unit;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum>=total)break;
            sum+=arr[i];
            count++;
        }
        if(sum<total)
            return 0;

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rat=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        System.out.println(solve(rat,unit,n,arr));
    }
}
