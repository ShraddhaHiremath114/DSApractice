
public class IntegerToRoman {
    //5->V | 3->III
    public static void main(String[] args) {
        int no=3;
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(no>=val[i]){
                no-=val[i];
                sb.append(s[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
