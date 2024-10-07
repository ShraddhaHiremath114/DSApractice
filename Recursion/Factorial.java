public class Factorial {
//TC- O(n) and Space-O(n)
    public static int  fun(int n){
        if(n==0)return 1;
        return n*fun(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
}
