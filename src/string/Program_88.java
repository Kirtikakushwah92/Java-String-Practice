package string;
//Valid Parentheses:

import java.util.Scanner;
import java.util.Stack;
public class Program_88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean res=validParanthesis(s);
		System.out.println(res);
		

	}
	public static boolean validParanthesis(String s) {
		
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				char top = st.pop();
			
				if((ch==')' && top !='(') ||
						(ch == '}' && top != '{')||
							ch==']' && top != ']') {
				return false;
	
					
				}
			}
		}
       return st.isEmpty(); 
		
	}
	

}
