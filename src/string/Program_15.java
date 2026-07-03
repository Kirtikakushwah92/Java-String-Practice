package string;

//WAJP to take a String input and replace all the space characters from _ in the String.
//a)By using replace() method
//b)Without using replace() method
import java.util.Scanner;
public class Program_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String result =replaceSpace(s);
		System.out.println(result);
	}
	public static String replaceSpace(String s) {
//		a) Using replace() method
//		return s.replace(' ', '_');
		
//		b) without using replace() method
		String replace = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c==' ') {
				replace = replace + '_';
			}
			else {
				replace = replace + c;
			}
		}
		return replace;
	}
	
	

}
