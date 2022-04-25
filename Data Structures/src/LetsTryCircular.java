public class LetsTryCircular {
public NodeCircular head;
public NodeCircular tail;
public int size;
  public NodeCircular CS(int x) {
	 head=new NodeCircular();
	 NodeCircular node=new NodeCircular();
	 node.data=x;
	 head=tail=node;
	 node.next=node;
	 size=1;
	 return head;
  }
  public void InsCS(int x,int loc) {
	  NodeCircular node=new NodeCircular();
	  node.data=x;
	  if(head==null) {
		  CS(x);
		  return;
	  }else if(loc==0) {
		  node.next=head;
		  head=node;
		  tail.next=head;
	  }else if(loc>=size) {
		  tail.next=node;
		  tail=node;
		  tail.next=head;
	  }else {
		  NodeCircular tmp=head;
		  int idx=1;
		  while(idx!=loc-1) {
			  tmp=tmp.next;idx++;
		  }
		  node.next=tmp.next;
		  tmp.next=node;
	  }
	  size++;
  }
  public void print() {
	  NodeCircular tmp=head;
	  if(head==null) {
		  System.out.println("Empty");
		  return;
	  }
	  while(tmp!=tail) {
		  System.out.print(tmp.data);
		  tmp=tmp.next;
		  if(tmp!=tail) {
			  System.out.print("->");
		  }else {
			  System.out.print("->"+tmp.data);
		  }
	  }	
	  System.out.println();
  }
  public void Del(int loc) {
	  if(head==null) {
		  System.out.println("Empty");
		  return;
	  }
	  if(loc==0) {
		  head=head.next;
		  tail.next=head;
		  size--;
		  if(size==0) {
			 tail=null;
			 head.next=null;
			 head=null;
		  }
	  }else if(loc>=size) {
		NodeCircular tmp=head;
		while(tmp.next!=tail) {
			tmp=tmp.next;
		}
		tmp.next=head;
		tail=tmp;
		size--;
		if(size==0) {
			head.next=null;
			head=null;
		}
	  }else {
		  NodeCircular tmp=head;int idx=1;
		  while(idx!=loc-1) {
			  tmp=tmp.next;
			  idx++;
		  }
		  tmp.next=tmp.next.next;
		  size--;
	  }
  }
}
