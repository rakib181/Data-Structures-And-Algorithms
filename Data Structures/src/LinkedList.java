public class LinkedList {
	public NodeCls head;
	public NodeCls tail;
	public int size;

	public void createLL(int x) {
		NodeCls new_node=new NodeCls();
		new_node.data=x;
		new_node.next=null;
		head=new_node;
		tail=new_node;
		size=1;
	}
	public void Insert(int x) {if(head==null) {
		createLL(x);
		return;
	}
		NodeCls new_node=new NodeCls();
		new_node.data=x;
		new_node.next=null;
		tail.next=new_node;
		tail=new_node;
		size++;
	}
	public void print() {
		NodeCls tmp=head;
		for(int i=0;i<size;i++) {
			System.out.print(tmp.data);
			tmp=tmp.next;
			if(i<size-1) {
				System.out.print("->");
			}
		}
		System.out.println();
	}
}
