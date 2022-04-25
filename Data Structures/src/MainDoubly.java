public class MainDoubly {
	public static void main(String[] args) {
		DoublyLinkedList yo=new DoublyLinkedList();
		yo.lets(10);
		yo.Ins(5, 0);
		yo.Ins(2, 3);
		yo.Ins(9, 0);
		yo.Ins(7, 0);
		yo.print();
		//yo.Ins(40, 3);
		yo.del(3);
		yo.print();
		yo.search(8);
		//yo.rev();
	}
}
