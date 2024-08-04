import java.util.Scanner;

public class MaxNoInd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxi=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                ind=i;
            }
        }
        System.out.println(maxi+" "+ind);
    }
}
