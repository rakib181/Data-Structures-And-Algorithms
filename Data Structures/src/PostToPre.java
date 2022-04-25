import java.util.*;

public class PostToPre {
    static String letsTry(String s) {
    	Stack<String>st=new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		if(Character.isLetterOrDigit(s.charAt(i))) {
    			st.push(s.charAt(i)+"");
    		}else {
    			String tmp1=st.peek();
    			st.pop();
    			String tmp2=st.peek();
    			st.pop();
    			st.push(s.charAt(i)+tmp2+tmp1);
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
