package hellokk.collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
//
public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(6);
		pq.offer(12);
		pq.offer(-2);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		LinkedList ll = new LinkedList();
		ll.offer("123");
		ll.add(1890);
		ll.add("123");
		System.out.println(ll);
		ll.poll();
		
	}
}
