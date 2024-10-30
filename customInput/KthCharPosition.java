import java.util.Scanner;
public class KthCharPosition {
    public static int find(String str,char key,int kth){
        int count=kth;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                if(count==1)return i;
                else{
                    count--;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        
        String str=sc.nextLine();
        String chr=sc.next();

        char key=chr.charAt(0);

        int kth=sc.nextInt();

        System.out.println(str+" "+key+" "+kth);

        System.out.println(find(str,key,kth));
    }
}
