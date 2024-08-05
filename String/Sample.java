public class Sample {
    public static void main(String[] args) {
        char ch='a';
        int c=ch;
        System.out.println(c);

        String str="ABCD";
        String lstr=str.toLowerCase();
        System.out.println(lstr);

        int[] arr=new int[123];
        for(int i=0;i<lstr.length();i++){
            int nch=lstr.charAt(i);
            // System.out.println(nch);
            arr[nch]=1;
        }
        int ans=0;
        
    }
}
