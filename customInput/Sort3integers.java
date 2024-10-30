import java.util.Scanner;
public class Sort3integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }

        for(int val:arr){
            System.out.print(val+" ");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
