import java.util.PriorityQueue;

public class KthLargestEle {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};

    int k=2;//2nd Largest element is 4

    PriorityQueue<Integer> minHeap=new PriorityQueue<>();

    for(int i=0;i<k;i++){
        minHeap.add(arr[i]);
    }

    for(int i=k;i<arr.length;i++){
        if(arr[i]>minHeap.peek()){
            minHeap.poll();
            minHeap.add(arr[i]);
        }
    }

    System.out.println(minHeap.peek());

    }
}
