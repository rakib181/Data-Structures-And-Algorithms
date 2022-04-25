public class QLMain {
	public static void main(String[] args) {
		QImplement q=new QImplement();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.print();
		q.dequeue();
		q.print();
		q.enqueue(0);
		q.print();
	}
}
