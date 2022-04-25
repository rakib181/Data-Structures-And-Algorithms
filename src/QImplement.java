public class QImplement {
public QNode head;
public QNode tail;
public int size;
public QNode CS(int x) {
	head=new QNode();
	QNode new_node=new QNode();
	new_node.data=x;
	head=tail=new_node;
	new_node.rear=new_node;
	size=1;
	return head;
}
public void enqueue(int x) {
	if(head==null) {
		CS(x);
		return;
	}
	QNode new_node=new QNode();
	new_node.data=x;
	tail.rear=new_node;
	tail=new_node;
	new_node.rear=head;
	size++;
}
public int dequeue() {
	if(head==null) {
		return (Integer) null;
	}
	head=head.rear;
	tail.rear=head;
	size--;
	if(size==0) {
		head=tail=null;
	}
	return head.data;
}
public void print() {
	if(head==null) {
		System.out.println("Empty");
		return;
	}
	QNode tmp=head;
	for(int i=0;i<size;i++) {
		System.out.print(tmp.data);
		tmp=tmp.rear;
		if(i<size-1) {
			System.out.print("<-");
		}
	}
	System.out.println();
}
public boolean isEmpty() {
	if(head==null) {
		return true;
	}
	return false;
}
}
