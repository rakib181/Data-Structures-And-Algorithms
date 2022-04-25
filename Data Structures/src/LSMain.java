public class LSMain {
	public static void main(String[] args) {
		LSStack yo=new LSStack();
		yo.push(10);
		yo.push(11);
		yo.push(12);
		yo.print();
		yo.peek();
		yo.pop();
		yo.print();
	}
}
