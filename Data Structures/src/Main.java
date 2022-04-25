
public class Main {
	public static void main(String[] args) {
		SinglyLL yo=new SinglyLL();
		yo.InsertFirst(12, 0);
		yo.InsertFirst(15, 1);
		yo.InsertFirst(17, 2);
		yo.InsertFirst(34, 0);
		yo.InsertFirst(50, 5);
		yo.InsertFirst(5, 3);
		yo.print();
		yo.del(2);
		yo.print();
	}
}
