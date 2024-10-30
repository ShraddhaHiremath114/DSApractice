import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PairSearch {
    public static void main(String[] args) {
        ArrayList<List<Integer>> pairs=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("How many pairs do you want to insert: ");
        int n=sc.nextInt();

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

        System.out.println("enter Key pairs: ");
        List<Integer> kpair=new ArrayList<>();
        kpair.add(sc.nextInt());
        kpair.add(sc.nextInt());

        System.out.println(kpair);

        int[] mark=new int[2];
        Arrays.fill(mark,-1);
        for(int i=0;i<pairs.size();i++){
            List<Integer> ip=pairs.get(i);
            for(int j=0;j<ip.size();j++){
                for(int k=0;k<kpair.size();k++){
                    if(kpair.get(k)==ip.get(j)){
                        mark[k]=1;
                    }
                }
            }
            if(mark[0]==1 && mark[1]==1){
                System.out.println("Yes");
                break;
            }else{
                mark[0]=-1;
                mark[1]=-1;
            }
        }

        if(mark[0]==-1 || mark[1]==-1){
            System.out.println("No");
        }
    }
}
