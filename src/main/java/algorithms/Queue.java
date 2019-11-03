package algorithms;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        KThInteger kThInteger = new KThInteger(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(kThInteger.peek());
        System.out.println(kThInteger.add(10));
        System.out.println(kThInteger.add(10));
        System.out.println(kThInteger.add(10));
        System.out.println(kThInteger.add(1));
    }
}
class KThInteger{
    final int k;
    final PriorityQueue<Integer> q;
    public KThInteger(int[] a , int k){
        this.q = new PriorityQueue<Integer>(k);
        this.k=k;
        for (int i = a.length - 1; i >= 0; i--) {
            add(a[i]);
        }
    }

    public int add(int i) {
        if(q.size()<k){
            q.offer(i);
        } else  if(q.peek()<i){
            q.poll();
            q.offer(i);
        }
        return q.peek();
    }
    public int peek(){
        return q.peek();
    }
}
