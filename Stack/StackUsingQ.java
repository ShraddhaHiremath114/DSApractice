import java.util.*;
public class StackUsingQ{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        int n=st.peek();
        System.out.println(n);
        //Q
        //Now reverse this stack using queue
        Queue<Integer> q=new LinkedList<>();

        while (!st.isEmpty()) {
            q.add(st.pop());
            // System.out.println(st.pop());
        }
        System.out.println(q);
        System.out.println(q.remove());
        StringBuilder cb=new StringBuilder();
        
    }
}