public class SinglyLL{
	public Node head;
	public Node tail;
	public int size;
	public Node Singly(int x) {
		head=new Node();
		Node node=new Node();
		node.next=null;
		node.data=x;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void InsertFirst(int x,int location) {
		Node new_node=new Node();
		new_node.data=x;
		if(head==null) {
			Singly(x);
			return;
		}else if(location==0) {
			new_node.next=head;
			head=new_node;
		}else if(location>=size){
			new_node.next=null;
			tail.next=new_node;
			tail=new_node;
		}else {
			Node tmp=head;int idx=1;
			while(idx!=location) {
				tmp=tmp.next;
				idx++;
			}
			Node nextnode=tmp.next;
			tmp.next=new_node;
			new_node.next=nextnode;	
		}
		size++;
	}
	public void print() {
		Node tmp=head;
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		while(tmp!=null) {
			System.out.print(tmp.data);
			tmp=tmp.next;
			if(tmp!=null) {
			System.out.print("->");
			}
		}
		System.out.println();
	}
	public void del(int loc) {	
		if(head==null) {
			System.out.println("Empty");
			return;
		}else if(loc==0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
		}else if(loc>=size){
			Node tmp=head;
			for(int i=1;i<size-1;i++) {
				tmp=tmp.next;
			}
			if(tmp==head) {
				tail=head=null;
				size--;
				return;
			}
			tmp.next=null;
			tail=tmp;
			size--;
		}else {
			Node tmp=head;
			for(int i=1;i<loc-1;i++) {
				tmp=tmp.next;
			}
			tmp.next=tmp.next.next;
			size--;
		}
	}
}
