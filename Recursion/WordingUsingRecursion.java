public class WordingUsingRecursion {
    static String ans="";
    static String[] word={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void fun(int no){
        if(no==0)return;
        fun(no/10);
        ans+=word[no%10]+" ";
    }
    public static void main(String[] args) {
        int no=123;
        fun(no);
        System.out.println(ans.trim());
    }
}
