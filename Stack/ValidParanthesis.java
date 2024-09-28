import java.util.Stack;

public class ValidParanthesis{
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        st.isEmpty();
        st.size();
        String s="Geek";
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(! st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
