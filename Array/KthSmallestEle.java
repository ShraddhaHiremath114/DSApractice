
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestEle {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};

    int k=2;//2nd smallest element is 2

    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

    for(int i=0;i<k;i++){
        maxHeap.add(arr[i]);
    }

    for(int i=k;i<arr.length;i++){
        if(arr[i]<maxHeap.peek()){
            maxHeap.poll();
            maxHeap.add(arr[i]);
        }
    }

    System.out.println(maxHeap.peek());

    }
}

