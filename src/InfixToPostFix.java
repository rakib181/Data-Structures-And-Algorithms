import java.util.*;
public class InfixToPostFix {
	static int precedence(char c) {
		switch(c) {
		case '^':
		    return 3;
		case '/':
		case '*':
			return 2;
		case '+':
		case '-':
			return 1;
		}
		return -1;
	}
	static String ItoP(String s) {
		String ans="";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				ans+=c;
			}else if(c=='(') {
				st.push(c);
			}else if(c==')') {
				while(!st.isEmpty() && st.peek()!='(') {
					ans+=st.pop();	
				}
				st.pop();
			}else {
				while(!st.isEmpty() && precedence(c)<=precedence(st.peek())) {
					ans+=st.pop();
				}
				st.push(c);
			}
		}
		while(!st.isEmpty()) {
			if(st.peek()=='(') {
				return "Invalid";
			}
			ans+=st.pop();
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(ItoP(s));
	}
}
