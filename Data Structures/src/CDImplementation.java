public class CDImplementation {
     CDNode head;
     CDNode tail;
     int size;
     public CDNode letTry(int x) {
    	 head=new CDNode();
    	 CDNode new_node=new CDNode();
    	 new_node.data=x;
    	 head=new_node;
    	 tail=new_node;
    	 new_node.next=new_node;
    	 new_node.prev=new_node;
    	 size=1;
    	 return head;
     }
     public void Ins(int x,int loc) {
    	 if(head==null) {
    		 letTry(x);
    		 return;
    	 }
    	 CDNode new_node=new CDNode();
    	 new_node.data=x;
    	 if(loc==0) {
    		new_node.next=head;
    		new_node.prev=tail;
    		head.prev=new_node;
    		tail.next=new_node;
    		head=new_node;
    	 }
    	 else if(loc>=size) {
    		 new_node.next=head;
    		 new_node.prev=tail;
    		 head.prev=new_node;
    		 tail.next=new_node;
    		 tail=new_node;
    	 }else {
    		 CDNode tmp=head;
    		 int idx=0;
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
    	 CDNode tmp=head;
    	 if(head==null) {
    		 System.out.println("Empty");
    		 return;
    	 }
    	 for(int i=0;i<size;i++) {
    		 System.out.print(tmp.data);
    		 tmp=tmp.next;
    		 if(i<size-1) {
    			 System.out.print("->");
    		 }
    	 }
    	 System.out.println();
     }
     public void search(int x) {
    	 CDNode tmp=head;int idx=0;
    	 while(idx<size) {
    		 if(tmp.data==x) {
    			 System.out.println("Found");
    			 return;
    		 }
    		 idx++;tmp=tmp.next;
    	 }
    	 System.out.println("Not Found");
     }
     public void del(int loc) {
    	 if(head==null) {
    		 System.out.println("Empty");
    		 return;
    	 }if(loc==0) {
    		 head=head.next;
    		 head.prev=tail;
    		 tail.next=head;
    		 size--;
    		 if(size==0) {
    			 head.next=null;
    			 head.prev=null;
    			 head=tail=null;
    		 }
    	 }else if(loc>=size) {
    		 tail=tail.prev;
    		 tail.next=head;
    		 head.prev=tail;
    		 size--;
    		 if(size==0) {
    			 head.next=null;
    			 head.prev=null;
    			 head=tail=null; 
    		 }
    	 }else {
    		 CDNode tmp=head;
    		 int idx=1;
    		 while(idx!=loc-1) {
    			 tmp=tmp.next;idx++;
    		 }
    		 tmp.next=tmp.next.next;
    		 tmp.next.prev=tmp;
    		 size--;
    	 }
     }
     public void delEntire() {
    	 CDNode tmp=head;
    	 for(int i=0;i<size;i++) {
    		 tmp.prev=null;
    		 tmp=tmp.next;
    	 }
    	 head=null;
    	 tail=null;
    	 System.out.println("Succeeded");
     }
}