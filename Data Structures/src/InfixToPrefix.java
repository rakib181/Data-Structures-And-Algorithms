import java.util.*;
public class InfixToPrefix {
	static int pre(char c) {
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
	static String InfxToPrefx(String s) {
		String prefix="";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				prefix+=s.charAt(i);
			}else if(s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}else if(s.charAt(i)==')') {
				while(!st.isEmpty() && st.peek()!='(') {
					prefix+=st.pop();
				}
				st.pop();
			}else {
				while(!st.isEmpty() && pre(s.charAt(i))<pre(st.peek())) {
					prefix+=st.pop();
				}
				st.push(s.charAt(i));
			}
		}
		while(!st.isEmpty()) {
			if(st.peek()=='(') {
				return "Invalid";	
				}
			prefix+=st.pop();
		}
		String ans="";
		for(int i=prefix.length()-1;i>=0;i--) {
			ans+=prefix.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),newStr="";
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='(') {
				newStr+=')';
			}
			else if(s.charAt(i)==')') {
				newStr+='(';
			}else {
				newStr+=s.charAt(i);
			}
		}
		System.out.println(InfxToPrefx(newStr));
	}
}