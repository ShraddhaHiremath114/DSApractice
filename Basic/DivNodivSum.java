public class DivNodivSum {
    public static int find(int n,int m){
        int divSum=0;
        int nodivSum=0;
        for(int i=1;i<=m;i++){
            if(i%n == 0)
                divSum+=i;
            else
                nodivSum+=i;
        }
        return Math.abs(nodivSum-divSum);

    }
    public static void main(String[] args) {
        int n=3;
        int m=9;
        System.out.println(find(n,m));
    }
}
