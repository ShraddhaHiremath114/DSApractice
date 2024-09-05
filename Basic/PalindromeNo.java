public class PalindromeNo {
    public static boolean check(int no){
        int temp=no;
        int rev=0;

        while(temp>0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }

        return no==rev;
    }
    public static void main(String[] args) {
        int no=121;
        System.out.println(check(no));
    }
}
