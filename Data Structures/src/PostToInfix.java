import java.util.*;

public class PostToInfix {
	static boolean isOperands(char c) {
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			return true;
		}
		return false;
	}
	static String letsTry(String s) {
		Stack<String> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
		if(isOperands(s.charAt(i))) {
			st.push(s.charAt(i)+"");
		}else {
			String tmp1=st.peek();
			st.pop();
			String tmp2=st.peek();
			st.pop();
			st.push("("+tmp2+s.charAt(i)+tmp1+")");
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
