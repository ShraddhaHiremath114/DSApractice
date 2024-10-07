public class OnetoN{
    public static void fun(int n){
        if(n==0)return;
        //System.out.println(n);// n to 1
        fun(n-1);
        System.out.println(n);//1 to n
    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}