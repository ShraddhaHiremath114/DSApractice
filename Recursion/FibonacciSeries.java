public class FibonacciSeries {
/*
 * TC- size of the tree grows exponentially i.e O(2^n)
 * Space- The space complexity is determined by the maximum depth of the recursion tree. O(n)
 */
    public static int fun(int n){
        if(n==0 || n==1)return n;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fun(n));
    }
}
