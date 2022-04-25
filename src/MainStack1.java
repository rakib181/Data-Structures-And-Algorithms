public class MainStack1 {
	public static void main(String[] args) {
		Stack1 yo=new Stack1(4);
		boolean ty=yo.isEmpty();
		System.out.println(ty);
		boolean yt=yo.isFull();
		System.out.println(yt);
		yo.push(3);
		yo.push(4);
		yo.push(5);
		yo.push(6);
		yo.push(7);
		yo.print();
		yo.pop();
		yo.print();
		yo.peek();
	}
}
