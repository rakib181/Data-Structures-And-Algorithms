public class SinglyLinkedList {
	 Node head;
	 public static int size;
	 SinglyLinkedList(){
		 this.size=0;
	 }
	 class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void AddFirst(int x) {
		Node new_node=new Node(x);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
	}
	public void AddLast(int x) {
		Node new_node=new Node(x);
		if(head==null) {
			head=new_node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
	}
	public void Print() {
		if(head==null) {
			System.out.println("EMPTY");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void DelFirst() {
		if(head==null) {
			System.out.println("EMPTY");
			return;
		}
		size--;
		head=head.next;
	}
	public void DelLast() {
		if(head==null) {
			System.out.println("EMPTY");
			return;
		}
		size--;
		Node temp=head.next,prev=head;
		while(temp.next!=null) {
			temp=temp.next;
			prev=prev.next;
		}
        prev.next=null;
	}
	public void InsertMid(int x,int pos) {
		Node new_node=new Node(x);
		Node temp=head.next,prev=head;
		if(pos<1||temp.next==null && prev==head || size<3) {
			System.out.println("NOT POSSIBLE");
			size--;
			return;
		}
		int i=1;
		while(i!=pos) {
			temp=temp.next;
			prev=prev.next;
			i++;
		}
		new_node.next=temp;
		prev.next=new_node;	
	}
	public void DelMid(int pos) {
		Node temp=head.next,prev=head;
		if(pos<=1||temp.next==null && prev==head || size<3) {
			System.out.println("NOT POSSIBLE");
			return;
		}
		size--;
		int i=2;
		while(i!=pos) {
			temp=temp.next;
			prev=prev.next;
			i++;
		}
		prev.next=temp.next;
	}
	public void DelVal(int val) {
		Node temp=head.next,prev=head;size--;
		if(prev.data==val) {
			head=temp;
			return;
		}
		while(temp.data!=val) {
			temp=temp.next;
			prev=prev.next;
		}
		prev.next=temp.next;	
	}
	public static void main(String[] args) {
	SinglyLinkedList yo=new SinglyLinkedList();
	yo.AddFirst(10);
	yo.AddFirst(15);
	yo.AddFirst(20);
	yo.AddLast(0);
	yo.InsertMid(5,3);
	 yo.DelVal(0); 
    yo.Print();
    System.out.println(size);
	}
}