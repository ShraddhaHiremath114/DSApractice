import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinMaxEle {
    public static void main(String[] args) {
        int[] a={20,10,60,30,50,40};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int k=2;//2nd largest
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(a[i]>pq.peek()){
                pq.poll();
                pq.add(a[i]);
            }
        }
        System.out.println(pq.peek());

        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        int ks=2;//2nd  smallest
        for(int i=0;i<k;i++){
            maxheap.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(a[i]<maxheap.peek()){
                maxheap.poll();
                maxheap.add(a[i]);
            }
        }
        System.out.println(maxheap.peek());
    }
}
