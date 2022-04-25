public class StackMinMain {
	public static void main(String[] args) {
		StackMin s=new StackMin();
		s.push(10);
		s.push(3);
		s.push(5);
		s.push(1);
		s.push(0);
		s.push(2);
		s.print();
		System.out.println(s.min(s));	
	}
}
