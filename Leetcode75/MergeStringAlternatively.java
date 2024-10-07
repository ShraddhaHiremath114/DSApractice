public class MergeStringAlternatively{
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqr";
        //apbqcr
        String merged="";
        int i1=0;
        int i2=0;
        while(i1<s1.length() && i2<s2.length()){
            merged+=s1.charAt(i1);
            merged+=s2.charAt(i2);
            i1++;
            i2++;
        }
        while(i1<s1.length()){
            merged+=s1.charAt(i1);
            i1++;

        }
        while(i2<s2.length()){
            merged+=s2.charAt(i2);
            i2++;
        }
        System.out.println(merged);
    }
}