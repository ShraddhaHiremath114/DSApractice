public class Ccode1 {
    public static void main(String[] args) {
        int A[]={3,2};
        int B[]={4,6};

        //9+16=25->5
        //4+36=40->

        int result=0;
        for(int i=0;i<A.length;i++){
            int no1=A[i]*A[i];
            int no2=B[i]*B[i];
            int sum=no1+no2;
            double ans=Math.sqrt(sum);
            result=result+(int)ans;
        }
        // double ans=Math.sqrt(40);
        System.out.println(Math.ceil(result));
        
    }
}
