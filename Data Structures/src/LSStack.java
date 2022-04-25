public class LSStack {
	LinkedListS linkedlist;
	public  LSStack(){
		linkedlist=new LinkedListS();
	}
   public void push(int x) {
	  linkedlist.Ins(x);
   }
   public void pop() {
	   linkedlist.del();
   }
   public void peek() {
	   if(linkedlist.head==null) {
		  System.out.println("Empty");
		  return;
	   }
	   System.out.println(linkedlist.head.data);
   }
   public void print() {
		  NodeLS tmp=linkedlist.head;
		 while(tmp!=null) {
			 System.out.print(tmp.data);
			 tmp=tmp.next;
			 if(tmp!=null) {
				 System.out.print("->");
			 }
		 }
		 System.out.println();
	  }
}
