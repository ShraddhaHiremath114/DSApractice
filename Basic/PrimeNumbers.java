public class PrimeNumbers {
    
    public static void main(String[] args) {
        // int N=5;
        // int factors=0;
        // for(int i=1;i<=N;i++){
        //     if(N%i ==0)factors++;
        //     if(factors>2)break;
        // }
        // if(factors==2)System.out.println("PrimeNo");
        // else{
        //     System.out.println("Not prime");
        // }

        int st=1;
        int lt=50;
        for(int i=st;i<=lt;i++){
            int fact=0;
            for(int j=1;j<=i;j++){
                if(i%j == 0)fact++;
                if(fact>2)break;
            }
            if(fact==2)System.out.print(i+" ");

        }
    }
}
