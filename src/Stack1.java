public class Stack1 {
int[] stack;
int top;
public Stack1(int size) {
	this.stack=new int[size];
	this.top=-1;
	System.out.println("Stack is created");
	}
public boolean isEmpty() {
	if(top==-1) {
		return true;
	}else {
		return false;
	}
}
public boolean isFull() {
	if(top==stack.length-1) {
		return true;
	}else {
		return false;
	}
}
public void push(int x) {
	if(isFull()) {
		System.out.println("Sorry Stack is Full");
	}else {
		stack[top+1]=x;
		top++;
	}
}
public void pop() {
	if(isEmpty()) {
		System.out.println("Stack is Empty");
	}else {
	System.out.println(stack[top]);
	top--;
	}
}
public void peek() {
	if(isEmpty()) {
		System.out.println("Satck is Empty");
	}else {
		System.out.println(stack[top]);
	}
}
public void print() {
	for(int i=0;i<=top;i++) {
		System.out.print(stack[i]);
		if(i<top) {
			System.out.print("->");
		}
	}
	System.out.println();
}
}
