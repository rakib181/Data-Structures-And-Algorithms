import java.util.*;
public class PreToIn {
	static boolean isOprn(char c) {
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			return true;
		}
		return false;
	}
	static String letsTry(String s) {
		Stack<String>st=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(isOprn(s.charAt(i))) {
				st.push(s.charAt(i)+"");
			}else{
				String tmp1=st.peek();
				st.pop();
				String tmp2=st.peek();
				st.pop();
				st.push(tmp1+s.charAt(i)+tmp2);
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
