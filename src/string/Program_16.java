package string;

//WAJP to check if a string contains only digits.

import java.util.Scanner;
public class Program_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean result =checkDigits(s);
		System.out.println(result);
	}
	public static boolean checkDigits(String s) {
		if(s.length()==0) {
			return false;
		}
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c<'0' || c>'9') {
				return false;
			}
		}
		return true;
	}
	
	

}
