import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PairDivisibleSum {
    public static void main(String[] args) {
        ArrayList<List<Integer>> pairs=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("How many pairs do you want to insert: ");
        int n=sc.nextInt();
        int k=sc.nextInt();

        System.out.println(n+" "+k);
        System.out.println("Enter Pairs: ");
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            list.add(n1);
            list.add(n2);

            pairs.add(list);

        }

        System.out.println(pairs);

        
        for(int i=0;i<pairs.size();i++){
            List<Integer> p=pairs.get(i);

            int n1=p.get(0);
            int n2=p.get(1);
            int sum=n1+n2;
            if(sum%k==0){
                System.out.println(p);
            }
        }
    }
}

