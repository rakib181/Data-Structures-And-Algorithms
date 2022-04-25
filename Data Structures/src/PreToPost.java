import java.util.*;
public class PreToPost {
	static String letsTry(String s) {
		Stack<String>st=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				st.push(s.charAt(i)+"");
			}else {
				String tmp1=st.pop();
				String tmp2=st.pop();
				st.push(tmp1+tmp2+s.charAt(i));
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
