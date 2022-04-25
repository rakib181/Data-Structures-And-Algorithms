import java.util.*;
public class QueueUsingTwoStacks {
	Stack<Integer>s1=new Stack<>();
	Stack<Integer>s2=new Stack<>();
	public static void main(String[] args) {
		QueueUsingTwoStacks q=new QueueUsingTwoStacks();
		q.push(10);
		q.push(9);
		q.push(11);
		System.out.println(q.s1);
		System.out.println(q.s2);
		System.out.println(q.pop());
		q.pop();
		System.out.println(q.s1);
		System.out.println(q.s2);
		System.out.println(q.pop());

	}
	public void push(int x) {
		s1.push(x);
	}
	public int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
}
