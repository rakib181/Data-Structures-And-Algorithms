public class StackMin {
  public StackMinNode head;
   public int size;
   int MN=1000000007;
   public void create(int x) {
	  StackMinNode node=new StackMinNode();
	  node.data=x;
	  node.next=null;
	  head=node;
	  size=1;
   }
   public void push(int x) {
	   if(head==null) {
		   create(x);
		   return;
	   }
	   StackMinNode node=new StackMinNode();
	   node.data=x;
	   node.next=head;
	   head=node;
	   size++;
	   }
   public int pop() {
	   StackMinNode tmp=head;
	  if(head==null) {
		  return 0;
	  } 
	  head=head.next;
	  size--;
	  if(size==0) {
		  head=null;
	  }
	  return tmp.data;
   }
   public int min(StackMin s) {
	   while(s.pop()<MN) {
		   MN=s.pop();
	   }
	   return MN;
   }
   public void print() {
	   StackMinNode tmp=head;
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
