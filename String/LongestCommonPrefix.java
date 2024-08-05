

import java.util.Arrays;

public class LongestCommonPrefix{
    public static void main(String[] args) {
        class Solution {
            public String longestCommonPrefix(String arr[]) {
                Arrays.sort(arr);
                String ans="";
                String first=arr[0];
                String last=arr[arr.length-1];
                
                for(int i=0;i<first.length();i++){
                    if(first.charAt(i)!=last.charAt(i)){
                        break;
                    }
                    ans=ans+first.charAt(i);
                }
                if(ans.length()>0){
                    return ans;
                }
                return "-1";
            }
        }
        String[] str={"club","clap","clove"};
        // int n=str.length;
        Arrays.sort(str);
        // for(String s:str){
        //     System.out.print(s+" ");
        // }

        StringBuffer sb=new StringBuffer();

        char first[]=str[0].toCharArray();
        char last[]=str[str.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            sb.append(first[i]);
        }
        System.out.println(sb.toString());
    }
}