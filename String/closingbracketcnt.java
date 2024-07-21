public class closingbracketcnt {
    public static void main(String[] args) {
        /*
         * Input: str = "(())))("
Output: 4
Explanation:
After index 4, string splits into (())
and ))(. Number of opening brackets in the
first part is equal to number of closing
brackets in the second part.

Input : str = "))"
Output: 2
Explanation:
As after 2nd position i.e. )) and "empty"
string will be split into these two parts:
So, in this number of opening brackets i.e.
0 in the first part is equal to number of
closing brackets in the second part i.e.
also 0.

         */
        String str="(())))(";
        //op is 4
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                count++;
            }
        }
        System.out.println(count);
    }
}
