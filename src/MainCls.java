public class MainCls {
public static void main(String[] args) {
	/*
	 * LinkedList yo=new LinkedList(); yo.createLL(1); yo.Insert(10); yo.Insert(12);
	 * yo.Insert(10); yo.Insert(9); yo.print(); Question1 letsgo=new Question1();
	 * letsgo.delDupli(yo); yo.print(); NodeCls n=letsgo.NthLast(yo, 4);
	 * System.out.println(n.data); letsgo.partition(yo, 10); yo.print();
	 */
	/*
	 * LinkedList yo=new LinkedList(); yo.Insert(7); yo.Insert(1); yo.Insert(6);
	 * LinkedList ty=new LinkedList(); ty.Insert(5); ty.Insert(9); ty.Insert(2);
	 * Question1 q=new Question1(); LinkedList fu=q.sumOfDigits(yo,ty); fu.print();
	 */
	LinkedList yo=new LinkedList();
	yo.Insert(3);
	yo.Insert(1);
	yo.Insert(5);
	yo.Insert(9);
	LinkedList ty=new LinkedList();
	ty.Insert(2);
	ty.Insert(4);
	ty.Insert(6);
	Question1 q=new Question1();
	q.InsSameNode(yo, ty, 7);
	q.InsSameNode(yo, ty, 2);
	q.InsSameNode(yo, ty, 1);
	NodeCls intersect=q.findNode(yo,ty);
	System.out.println(intersect.data);
}
}
