import java.util.Arrays;

public class Sample{
    
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            String no=Integer.toString(i,2);
            int count=0;
            for(int j=0;j<no.length();j++){
                if(no.charAt(j)=='1'){
                    count++;
                }
            }
            dp[i]=count;
        }
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
        // int count=0;
        // String no=Integer.toString(n,2);
        // for(int i=0;i<no.length();i++){
        //     if(no.charAt(i)=='1')count++;
        // }
           
        // System.out.println(count);
    }
}