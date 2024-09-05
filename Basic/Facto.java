public class Facto{
    public static int findFacto(int n){
        if(n==0)return 1;
        return n*findFacto(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        System.out.println(findFacto(n));
    }
}