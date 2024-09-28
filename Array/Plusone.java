public class Plusone{
    public static void main(String[] args) {
        int digits[]={1,2,3};
        int res=0;
        for(int i=0;i<digits.length;i++){
            res=res*10+digits[i];
        }
        System.err.println(res);
        int po1=res+1;
        System.out.println(po1);
        String polen=String.valueOf(po1);
        System.out.println(polen.length());

        
    }
}