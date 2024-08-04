import java.util.HashSet;
import java.util.Set;

public class AutobiographicalNo {
    public static void main(String[] args) {
        String str="1210";
        char arr[]=str.toCharArray();
        for(char val:arr){
            int ano=val-'0';
            if(ano==2){
                System.out.println(ano);
            }
        }

        int helpingarr[]=new int[str.length()];

        for(int i=0;i<helpingarr.length;i++){
            int cnt=0;
            for(int j=0;j<helpingarr.length;j++){
                if(arr[j]-'0' ==i){
                    cnt++;
                }
            }
            helpingarr[i]=cnt;
        }

        for(int val:helpingarr){
            System.out.print(val+" ");
        }

        Set set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(arr[i]-'0' == helpingarr[i]){
                set.add(helpingarr[i]);
            }
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
