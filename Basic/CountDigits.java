public class CountDigits {
    public static void main(String[] args) {
        int num=12;
        int count=0;

        int no=num;
        while(no>0){
            int rem=no%10;
            if(rem!=0 && num%rem==0){
                count++;
            }
            no/=10;
        }
        System.out.println(count);
    }
}
