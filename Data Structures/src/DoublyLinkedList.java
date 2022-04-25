public class DoublyLinkedList {
   DoublyLL head;
   DoublyLL tail;
   int size;
   public DoublyLL lets(int x) {
	   head=new DoublyLL();
	   DoublyLL new_node=new DoublyLL();
	   new_node.data=x;
	   new_node.next=null;
	   new_node.prev=null;
	   head=tail=new_node;
	   size=1;
	   return head;
   }
   public void Ins(int x,int loc) {
	   DoublyLL new_node=new DoublyLL();
	   new_node.data=x;
	   if(head==null) {
		   lets(x);
		   return;
	   }
	   if(loc==0) {
		  head.prev=new_node;
		  new_node.next=head;
		  head=new_node;
	   }else if(loc>=size) {
		   new_node.next=null;
		   tail.next=new_node;
		   new_node.prev=tail;
		   tail=new_node;
	   }else {
		   DoublyLL tmp=head;int idx=1;
		   while(idx!=loc-1) {
			   tmp=tmp.next;idx++;
		   }
		   new_node.prev=tmp;
		   new_node.next=tmp.next;
		   tmp.next=new_node;
		   new_node.next.prev=new_node;
	   }
	   size++;
   }
   public void print() {
	   if(head==null) {
		   System.out.println("Empty");
		   return;
	   }
	   DoublyLL tmp=head;
	   while(tmp!=null) {
		   System.out.print(tmp.data);
		   tmp=tmp.next;
		   if(tmp!=null) {
			   System.out.print("->");
		   }
	   }
	   System.out.println();
   }
   public void rev() {
	   if(head==null) {
		   System.out.println("Empty");
		   return;
	   }
	   DoublyLL tmp=tail;
	   while(tmp!=null) {
		   System.out.print(tmp.data);
		   tmp=tmp.prev;
		   if(tmp!=null) {
			   System.out.print("->");
		   }
	   }
	   System.out.println();
   }
   public void del(int pos) {
	   if(head==null) {
		   System.out.println("Not Possible");
		   return;
	   }
	   if(pos==0) {
		   head=head.next;
		   head.prev=null;
		   size--;
		   if(size==0) {
			   head=null;
			   head=null;
		   }
	   }else if(pos>=size) {
		   DoublyLL tmp=tail.prev;
		   if(size==1) {
			   head=null;
			   head=null;
			   size--;
		   }else {
			   tmp.next=null;
			   tail=tmp;
			   size--;
		   }
	   }else {
		   DoublyLL tmp=head;int idx=1;
		   while(idx!=pos-1) {
			   tmp=tmp.next;idx++;
		   }
		   tmp.next=tmp.next.next;
		   tmp.next.prev=tmp;
		   size--;
	   }
   }
   public void search(int x) {
	   DoublyLL tmp=head;
	   if(tmp!=null) {
	  for(int i=0;i<size;i++) {
	   if(tmp.data==x) {
		   System.out.println("Found");
		   return;
	   }
	   tmp=tmp.next;
	   }
	  System.out.println("Not Found");
	   }
   }
}
