public class Pillow {
    public static void main(String[] args) {
        int n=3;
        int time=2;
        int s=time;
        int p=1;
        int flag=0;
        while(s>0){
            s--;
            if(flag==0){
                ++p;
            }else{
                p--;
            }
            
            if(p==0){
                p=n;
                flag=0;
            }
            
           if(p==n){
                flag=1;
                p=n-1;
            }
        }
        System.out.println(p);
    }
}
