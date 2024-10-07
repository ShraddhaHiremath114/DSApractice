public class PowerN {

    public static int fun(int n,int m){
        if(m==0)return 1;
        return n*fun(n,m-1);
    }
    public static void main(String[] args) {
        int n=2;
        int m=4;
        System.out.println(fun(n,m));
    }
}
