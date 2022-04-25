public class CircularQueue2 {
	int size;
	int front,rear;
	int queue[];
	
	public CircularQueue2(int size) {
		this.size=size;
		this.front=-1;
		this.rear=-1;
		this.queue=new int[size];
	}
	public boolean isFull() {
		if(front==0 && rear==size-1) {
			return true;
		}else if(front==rear+1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}else {
			return false;
		}
	}
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}else {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			queue[rear]=x;
		}
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Not Possible");
			return;
		}else {
			if(front==rear) {
			front=rear=-1;
		}else {
		front=(front+1)%size;
		}
	}
	}
	public void printQ() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}
		int i=front;
		for(;i!=rear;i=(i+1)%size) {
			System.out.print(queue[i]);
			if(i!=rear) {
				System.out.print("<-");
			}
		}
		System.out.print(queue[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		CircularQueue2 q=new CircularQueue2(4);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.printQ();
		q.dequeue();
		q.printQ();
		q.enqueue(34);
		q.printQ();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.isFull()+" "+q.isEmpty());	
	}
}
