package com.algos;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKthElements {
	public static void main(String[] args) {
		// Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		// k = 5
		// Output : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
		Queue<Integer> queue = new LinkedList<Integer>();
		//add all to queue in reverse order 
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		
		System.out.println(queue);
		
		int k=5;
		
		queue = reverseFirstKthEles(queue,5);
		
	}

	private static Queue<Integer> reverseFirstKthEles(Queue<Integer> queue, int k) {
		int i=k;
		Stack<Integer> queue2 = new Stack<Integer>();
		while(i>0 && i<=k) {
			//System.out.println(queue.poll());
			queue2.add(queue.poll());
			i--;
		}
		System.out.println(queue2);
		queue2.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		System.out.println(queue2);
		System.out.println(queue);
		Stack<Integer> stack = new Stack<Integer>();
		//stack.pop();
		i=queue.size();
		k=i;
		while(i>0 && i<=k) {
			queue2.add(queue.poll());
			i--;
		}
		System.out.println(queue2);
		System.out.println(queue);
		return null;
	}
}
