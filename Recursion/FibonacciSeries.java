public class FibonacciSeries {

    public static int fun(int n){
        if(n==0 || n==1)return n;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fun(n));
    }
}
