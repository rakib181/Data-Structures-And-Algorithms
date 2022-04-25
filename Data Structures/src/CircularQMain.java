public class CircularQMain {
	public static void main(String[] args) {
		CircularQueueArray yo=new CircularQueueArray(5);
		yo.enqueue(10);
		yo.enqueue(15);
		yo.enqueue(20);
		yo.enqueue(9);
		yo.enqueue(25);
		yo.dequeue();
		yo.print();
	}
}
