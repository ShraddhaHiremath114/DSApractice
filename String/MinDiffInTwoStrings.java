public class MinDiffInTwoStrings {
    public static void main(String[] args) {
        String str[]={"geeks","for","geeks","contribute","practice"};
        String word1="geeks";
        String word2="practice";

        //geeks->2 & practice->4 ans=4-2->2
        int ans=Integer.MAX_VALUE;
        int i1=-1;
        int i2=-1;
        for(int i=str.length-1;i>=0;i--){
            if(str[i]==word2){
                i2=i;
            }
            if(str[i]==word1){
                i1=i;
            }
            if(i1!=-1 && i2!=-1){
                ans=Math.min(ans, Math.abs(i2-i1));
            }
        }
        System.out.println(ans);
    }
}
