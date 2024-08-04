import java.util.Scanner;

public class PalindromeNoWithinRange {
    public static int find(int i){
        int rev=0;
        while(i>0){
            int rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lm=sc.nextInt();
        int ul=sc.nextInt();

        for(int i=lm;i<=ul;i++){
            int rev=find(i);
            if(rev==i)
            System.out.print(i+" ");
        }
    }
}
