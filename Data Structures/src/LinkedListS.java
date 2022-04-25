public class LinkedListS {
  public NodeLS head;
  public int size;
  public void create(int x) {
	  NodeLS new_node=new NodeLS();
	  new_node.data=x;
	  new_node.next=null;
	  head=new_node;
	  size=1;
  }
  public void Ins(int x) {
	  if(head==null) {
		  create(x);
		  return;
	  }
	  NodeLS new_node=new NodeLS();
	  new_node.data=x;
	  new_node.next=head;
	  head=new_node;
	  size++;
  }
  public void del() {
	  if(head==null) {
		  System.out.println("Stack is Empty");
		  return;
	  }
	  System.out.println(head.data);
	  head=head.next;
  }
}
