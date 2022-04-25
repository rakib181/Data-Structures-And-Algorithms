
public class FloydCycleFinding {

	public static void main(String[] args) {
		CreateLinkedList ll=new CreateLinkedList();
		ll.addData(10);
		ll.addData(20);
		ll.addData(30);
		ll.addData(40);
		ll.addData(50);
		NodeF tmp=ll.head;
		while(tmp.next!=null) {
			tmp=tmp.next;
		}
		tmp.next=ll.head;
		NodeF ls2=ll.detectloop();
		ll.delCycle(ll.yo);
		if(ls2==null) {
			System.out.println("No Cycle !");
		}else {
			System.out.println("Cycle Exist !"+" Start From : "+ls2.data);
		}
		NodeF ls1=ll.detectloop();
		if(ls1==null) {
			System.out.println("No Cycle !");
		}else {
			System.out.println("Cycle Exist !"+" Start From : "+ls1.data);
		}
	}
}
