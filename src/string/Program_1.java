package string;
//WAJP to take a String input get length of String without using length() method in at least four different ways.
import java.util.Scanner;
public class Program_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l =getLengthOfString(s);
		System.out.println(s+" : "+l);

	}
	public static int getLengthOfString(String s) {
//		Method 1: Using toCharArray()
//		int count=0;
//		char [] ch = s.toCharArray();
//		for(char c : ch) {
//			count++;
//		}
//		return count;
		
//		Method 2: Using split("")
		
//		if(s.isEmpty()) {
//			return 0;
//		}
//		String[] arr = s.split("");
//		return arr.length;
		
//		Method 3: Using Exception Handling
//		int count =0;
//		try {
//			while(true) {
//				s.charAt(count);
//					count++;
//			}
//		}
//		catch(Exception e) {
//			
//		}
//		return count++;
//		
//		}
		
//		Method 4: Using Recursion
		if(s.equals("")) {
			return 0;
		}
		return 1+getLengthOfString(s.substring(1));
	}
	

}
