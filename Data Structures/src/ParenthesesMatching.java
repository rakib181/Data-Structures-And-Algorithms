import java.util.*;
public class ParenthesesMatching {
	static boolean isBalanced(String s) {
		char [] ch=s.toCharArray();
		int n=ch.length;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<n;i++) {
			if(isOpening(ch[i])) {
				st.push(ch[i]);
			}else {
				if(st.isEmpty()) {
					return false;
				}else if(!isMatching(st.peek(),ch[i])) {
					return false;
				}else {
				st.pop();
				}
			}
		}
	return st.isEmpty();
	}
	static boolean isOpening(char c) {
		if(c=='(') {
			return true;
		}else if(c=='{') {
			return true;
		}else if(c=='[') {
			return true;
		}else {
		 return false;
		}
	}
	static boolean isMatching(char c1,char c2) {
		if(c1=='(' && c2==')') {
			return true;
		}else if(c1=='{' && c2=='}') {
			return true;
		}else if(c1=='[' && c2==']') {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(isBalanced(s)) {
			System.out.println("Matched!");
		}else {
			System.out.println("Not Matched!");
		}
	}
}
