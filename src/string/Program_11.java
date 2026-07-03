package string;

//Design a method which will accept a String input and return the reverse of the String.
//a)By running loop from index 0
//b)By running loop from last index

import java.util.Scanner;
public class Program_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String result =reverseOfString(s);
		System.out.println(result);

	}
	public static String reverseOfString(String s) {
//		a)By running loop from index 0
//		String reverse = "";
//		for(int i=0;i<s.length();i++){
//			char c = s.charAt(i);
//			reverse = c+reverse;
//		}
//       
//		return reverse;
//		---------------------------
//		b)By running loop from last index
		String reverse ="";
		for(int i = s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			reverse = reverse + c;
			
		}
		return reverse;
		
	}
	
	

}
