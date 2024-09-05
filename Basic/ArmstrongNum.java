public class ArmstrongNum {
    public static void main(String[] args) {
        int no=153;
        int originalno=no;
        int digitcount=0;
        int digit=no;
        while(digit>0){
            int rem=digit%10;
            digitcount++;
            digit/=10;
        }
        System.out.println(digitcount);
        int n=digitcount;
        int add=0;
        while(no>0){
            int rem=no%10;
            add+=Math.pow(rem,n);
            no/=10;
        }
       if(add==originalno){
        System.out.println("Armstrong Number");
       }else{
        System.out.println("Not an Armstrong Num");
       }
       
    }
}
