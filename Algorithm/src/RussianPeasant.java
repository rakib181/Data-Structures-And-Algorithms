import java.util.*;
public class RussianPeasant {
	static long russPeasant(int x,int y) {
		long res=0;
		while(y>0) {
			if((y&1)==1) {
				res+=x;
			}
			x<<=1;
			y>>=1;
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt();
	System.out.println(russPeasant(a,b));
	}
}