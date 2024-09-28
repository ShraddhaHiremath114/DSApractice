import java.util.*;
public class ImplementQueueUsingTwoStack{
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public void enQueue(int x){
        input.push(x);
    }
    public int deQueue(){
        if(input.isEmpty() && output.isEmpty()){
            return -1;
        }
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    public static void main(String[] args) {
        
        /*
         * 4 1
         * 3 2
         * 2 3
         * 1 4
         */

         ImplementQueueUsingTwoStack obj=new ImplementQueueUsingTwoStack();
         obj.enQueue(1);
         obj.enQueue(2);
         obj.enQueue(3);
         obj.enQueue(4);
         System.out.println(obj.deQueue());
         System.out.println(obj.deQueue());
         System.out.println(obj.deQueue());
         System.out.println(obj.deQueue());
    }
}