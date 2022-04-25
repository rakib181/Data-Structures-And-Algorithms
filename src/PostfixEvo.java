import java.util.*;
public class PostfixEvo {
	static int yo(int op1,int op2,char c) {
		switch(c) {
		case '^':
			return (int) Math.pow(op1, op2);
		case '/':
			return op1/op2;
		case '*':
			return op1*op2;
		case '+':
			return op1+op2;
		case '-':
			return op1-op2;
		}
		return -1;
	}
	static boolean isOprtr(char c) {
		switch(c) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		}
		return false;
	}
	static int letsTry(String s) {
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(!isOprtr(s.charAt(i))) {
				st.push(s.charAt(i)-'0');
			}else {
				int tmp1=st.pop();
				int tmp2=st.pop();
				st.push(yo(tmp2,tmp1,s.charAt(i)));
			}
		}
		return st.peek();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(letsTry(s));
	}
}
