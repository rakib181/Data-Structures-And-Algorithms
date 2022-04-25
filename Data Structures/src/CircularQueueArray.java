public class CircularQueueArray {
     int[] cqueue;
     int front;
     int rear;
     int size;
     public CircularQueueArray(int size) {
    	 this.cqueue=new int[size];
    	 this.front=-1;
    	 this.rear=-1;
    	 this.size=size;
    	 System.out.println("Created Queue of Size :"+size);
     }
     public boolean isEmpty() {
    	 if(front==-1) {
    		 return true;
    	 }
    	 return false;
     }
     public boolean isFull() {
    	 if(rear+1==front) {
    		 return true;
    	 }else if(front==0 && rear+1==size) {
    		 return true;
    	 }
    	 return false;
     }
     public void enqueue(int x) {
    	 if(isFull()) {
    		 System.out.println("Full");
    		 return;
    	 }
    	 else if(isEmpty()) {
    		 front=0;
    		 cqueue[++rear]=x;
    	 }else {
    		 if(rear+1==size) {
    			 rear=0;
    		 }else {
    			 rear++;
    		 }
    		 cqueue[rear]=x;
    	 }
     }
     public void print() {
    	 if(front==-1) {
    		 System.out.println("Empty");
    		 return;
    	 }
    	 for(int i=front;i<=rear;i++) {
    		System.out.print(cqueue[i]);
    		if(i<size-1) {
    			System.out.print("<-");
    		}
    	 }
    	 System.out.println();
     }
     public void dequeue() {
    	 if(isEmpty()) {
    		 System.out.println("Empty");
    		 return;
    	 }else {
    		 if(front==rear) {
    			 front=rear=-1;
    		 }else if(front+1==size) {
    			 front=0;
    		 }else {
    			 front++;
    		 }
    	 }
     }
}
