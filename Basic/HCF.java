public class HCF {
    public static int hcf(int x,int y){
        if(y==0)return x;

        return hcf(y,x%y);
    }
    public static void main(String[] args) {
        int x=12;
        int y=18;
        System.out.println(hcf(x,y));
    }
}
