import java.util.*;
public class ArrIo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int s=sc.nextInt();
            int[] arr=new int[s];
            for(int j=1;j<=s;j++){
                arr[i]=sc.nextInt();
            }
        }
    }
}