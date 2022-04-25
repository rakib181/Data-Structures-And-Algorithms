public class CreateLinkedList {
   public NodeF head;
   public NodeF yo;
   public int size;
   public void clL(int x) {
	   NodeF new_node=new NodeF(x);
	   new_node.data=x;
	   new_node.next=null;
	   head=new_node;
	   size=1;
   }
   public void addData(int x) {
	   if(head==null) {
		   clL(x);
		   return;
	   }
	   NodeF new_node=new NodeF(x);
	   new_node.data=x;
	   new_node.next=head;
	   head=new_node;
	   size++;
   }
   public NodeF detectloop() {
	   NodeF slow=head;
	   NodeF fast=head;
	   while(slow!=null && fast!=null && fast.next!=null) {
		   slow=slow.next;
		   fast=fast.next.next;
		   if(slow==fast) {
			   yo=fast;
			   break;
		   }
	   }
	   if(slow!=fast) {
		   return null;
	   }
	   slow=head;int cnt=0;
	   while(slow!=fast) {
		  
		   slow=slow.next;
		   fast=fast.next;
	   }
	   return fast;
   }
  public void delCycle(NodeF meet) {
	  NodeF tmp1=meet,tmp2=meet;
	  while(tmp2.next!=tmp1) {
		tmp2=tmp2.next;
	  }
	  tmp2.next=null;
  }
}
