package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		Stack s = new Stack();
		/* Queue : 인터페이스
		 * Queue 인터페이스를 구현한 클래스(Linked List)를 이용하여
		 * Queue 인터페이스의 객체를 생성할 수 있다. 
		 */
		Queue q = new LinkedList();

		s.push("0");
		s.push("1");
		s.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==STACK==");
		while(!s.empty()){
			System.out.println(s.pop());
		}
		System.out.println("==QUEUE==");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
