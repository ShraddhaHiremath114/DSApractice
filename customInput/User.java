import java.util.Scanner;
public class User{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("You entered array size: "+n);
        System.out.println("You entered array elements as: ");
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
} 